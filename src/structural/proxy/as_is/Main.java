package structural.proxy.as_is;

public class Main {
    public static void main(String[] args) {
        // 사용하지 않아도 객체 생성 시 이미 로딩 수행됨
        RealImage img1 = new RealImage("photo1.jpg");
        RealImage img2 = new RealImage("photo2.jpg");

        img1.display();
        img2.display();
    }
}
