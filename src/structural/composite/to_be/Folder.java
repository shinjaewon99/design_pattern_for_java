package structural.composite.to_be;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileComponent {
    private final String name;
    private final List<FileComponent> children = new ArrayList<>(); // 인터페이스를 담음

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileComponent component) {
        children.add(component);
    }

    @Override
    public void showName() {
        System.out.println("폴더: " + name);
        for (FileComponent c : children) {
            c.showName();
        }
    }
}