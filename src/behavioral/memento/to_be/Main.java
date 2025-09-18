package behavioral.memento.to_be;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.write("Hello, ");
        caretaker.addMemento(editor.save()); // 현재 상태 저장

        editor.write("world!");
        caretaker.addMemento(editor.save()); // 현재 상태 저장

        editor.write(" Goodbye!");
        editor.print(); // Hello, world! Goodbye!

        editor.restore(caretaker.getMemento(1)); // 이전 상태로 복원
        editor.print(); // Hello, world!
    }
}
