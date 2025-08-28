package creational.singleton.multi_thread.to_be;

public class Printer {
    private static  Printer instance;

    private Printer(){}

    // synchronized, 쓰레드간 동기화를 위해 사용 (다른 쓰레드가 자원에 접근하지 못하게 LOCK을 검)
    // 무의미 하게 남발 할 경우 성능 저하를 일으킴
    public static synchronized Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }

    public void print(String msg) {
        System.out.println(msg);
    }
}