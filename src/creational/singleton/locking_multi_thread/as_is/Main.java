package creational.singleton.locking_multi_thread.as_is;

public class Main {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        Printer p2 = new Printer();

        System.out.println("p1 == p2 ? " + (p1 == p2)); // false
    }
}