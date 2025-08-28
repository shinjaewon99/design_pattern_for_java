package creational.singleton.single_thread.to_be;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 쓰레드 세이프 검증
         */
        Printer[] singleton = new Printer[10];
        ExecutorService service = Executors.newFixedThreadPool(10);

        CountDownLatch startLatch = new CountDownLatch(1);
        CountDownLatch doneLatch = new CountDownLatch(10);

        for (int i = 0; i < 10; i++) {
            final int num = i;
            service.submit(() -> {
                try {
                    startLatch.await();             // 동시에 출발
                    singleton[num] = Printer.getInstance();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    doneLatch.countDown();
                }
            });
        }

        startLatch.countDown(); // 스레드 동시에 시작
        doneLatch.await();      // 모든 작업 끝날 때까지 대기
        service.shutdown();

        for (Printer s : singleton) {
            System.out.println(s);
        }

        Printer p1 = Printer.getInstance();
        Printer p2 = Printer.getInstance();

        p1.print("Hello");
        p2.print("World");

        System.out.println("p1 == p2 ? " + (p1 == p2)); // true
    }
}