package behavioral.memento.to_be;

public class TextEditor {
    private String text = "";

    public void write(String text) {
        this.text += text;
    }

    public void print() {
        System.out.println(this.text);
    }

    public Memento save() {
        return new Memento(this.text);
    }

    public void restore(Memento memento) {
        this.text = memento.getState();
    }
}
