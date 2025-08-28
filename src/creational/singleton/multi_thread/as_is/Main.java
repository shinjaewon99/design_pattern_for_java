package creational.singleton.multi_thread.as_is;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            // 쓰레드 마다 다른 객체가 생성
            Printer p = new Printer();
            System.out.println(Thread.currentThread().getName() + " -> " + p);
        };

        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");
        t1.start();
        t2.start();
    }
}