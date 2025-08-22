package creational.abstractFactory.as_is;

public class Main {
    public static void main(String[] args) {
        // 클라이언트가 직접 new로 부품을 생성
        Engine hEngine = new HEngine();
        Tire hTire = new HTire();

        hEngine.start();
        hTire.roll();

        Engine kEngine = new KEngine();
        Tire kTire = new KTire();

        kEngine.start();
        kTire.roll();

        /**
         * 팩토리 메소드 패턴과 유사하게, 확장에 유연하지 못함
         * 팩토리 메소드 패턴과 다른점이라고 하면 팩토리 메소드는 "단일" 객체 생성
         * 추상 팩토리는 관련 객체들의 "제품군" 을 생성함
         */
    }
}