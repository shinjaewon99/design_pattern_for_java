package structural.proxy.to_be;

public class RealImage {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println(filename + " 로딩 중...");
        try {
            Thread.sleep(1000); // 무거운 작업이라 가정
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void display() {
        System.out.println(filename + " 보여주기");
    }
}