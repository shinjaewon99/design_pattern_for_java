package creational.singleton.single_thread.to_be;

// 단일 쓰레드 환경에서의 싱글톤
public class Printer {
    private static Printer instance; // static으로 선언 함으로써 Static 영역에 생성

    // 외부에서 접근 방지
    private Printer() {}

    public static Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }

    public void print(String msg) {
        System.out.println(msg);
    }
}
