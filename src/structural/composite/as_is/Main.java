package structural.composite.as_is;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("a.txt");
        File file2 = new File("b.txt");

        Folder folder = new Folder("문서");
        folder.addFile(file1);
        folder.addFile(file2);

        // 파일과 폴더를 따로 처리해야함 (폴더에서 파일로 아래로 내려가는 트리구조라고 가정한다면)
        file1.showName();
        folder.showName();
    }
}