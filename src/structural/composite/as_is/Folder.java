package structural.composite.as_is;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    private final String name;
    private final List<File> files = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void showName() {
        System.out.println("폴더 : " + name);
        for (File file : files) {
            file.showName();
        }
    }
}