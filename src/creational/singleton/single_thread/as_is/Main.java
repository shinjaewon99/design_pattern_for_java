package creational.singleton.single_thread.as_is;

public class Main {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        Printer p2 = new Printer();

        p1.print("HELLO");
        p2.print("WORLD");

        System.out.println("p1 == p2 ? " + (p1 == p2)); // 서로 다른 인스턴스, false
    }
}