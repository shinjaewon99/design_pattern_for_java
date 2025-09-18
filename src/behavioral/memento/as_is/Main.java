package behavioral.memento.as_is;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.type("Hello ");
        String savedState = editor.getText(); // 직접 저장

        editor.type("World!");
        System.out.println("현재 텍스트: " + editor.getText());

        // 되돌리기 (외부에서 상태를 다시 넣어줌)
        editor.setText(savedState);
        System.out.println("되돌린 텍스트: " + editor.getText());
    }
}
