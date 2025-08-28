package creational.singleton.locking_multi_thread.to_be;

class Printer {
    // volatile 키워드로 CPU 캐시 불일치 방지
    // synchronized 와 달리 데이터에 Lock을 걸지 않아 성능에 이점이 있음
    // 단순 플래그 같은 경우에 사용
    private static volatile Printer instance;

    private Printer() {}

    public static Printer getInstance() {
        if (instance == null) { // 1차 체크
            synchronized (Printer.class) {
                if (instance == null) { // 2차 체크
                    instance = new Printer();
                }
            }
        }
        return instance;
    }

    public void print(String msg) {
        System.out.println(msg);
    }
}