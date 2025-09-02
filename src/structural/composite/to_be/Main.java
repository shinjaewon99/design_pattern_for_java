package structural.composite.to_be;

public class Main {
    public static void main(String[] args) {
        FileComponent file1 = new File("a.txt");
        FileComponent file2 = new File("b.txt");

        Folder folder = new Folder("문서");
        folder.add(file1);
        folder.add(file2);

        Folder root = new Folder("루트");
        root.add(folder);

        // 폴더 내부에 폴더를 담을수 있는, 재귀적 호출이 가능
        root.showName();
    }
}