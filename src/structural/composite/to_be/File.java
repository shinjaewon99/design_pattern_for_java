package structural.composite.to_be;

public class File implements FileComponent {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showName() {
        System.out.println("파일: " + name);
    }
}