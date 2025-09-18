package behavioral.memento.as_is;

public class TextEditor {
    private String text = "";

    public void type(String newText) {
        text += newText;
    }

    public String getText() {
        return text;
    }

    public void setText(String state) { // 외부에서 직접 상태 관리
        this.text = state;
    }
}
