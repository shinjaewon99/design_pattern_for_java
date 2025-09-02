package structural.composite.as_is;

public class File {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println("파일: " + name);
    }
}