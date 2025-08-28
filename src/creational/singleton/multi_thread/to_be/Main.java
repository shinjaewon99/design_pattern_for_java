package creational.singleton.multi_thread.to_be;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            Printer p = Printer.getInstance();
            System.out.println(Thread.currentThread().getName() + " -> " + p);
        };

        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");
        t1.start();
        t2.start();
    }
}