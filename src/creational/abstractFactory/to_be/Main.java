package creational.abstractFactory.to_be;

public class Main {
    public static void main(String[] args) {
        // 현대 자동차 제품군 생성
        CarFactory hFactory = new HFactory();
        Engine hEngine = hFactory.createEngine();
        Tire hTire = hFactory.createTire();

        hEngine.start();
        hTire.roll();

        // 기아 자동차 제품군 생성
        CarFactory kFactory = new KFactory();
        Engine kEngine = kFactory.createEngine();
        Tire kTire = kFactory.createTire();

        kEngine.start();
        kTire.roll();

        /**
         * OCP 준수 -> 기존 코드를 수정하지 않고 확장이 가능
         * Tesla 제조사를 추가시 Main 코드를 수정하지 않고 확장이 가능
         */

    }
}