package creational.factorMethod.as_is;

public class Main {
    public static void main(String[] args) {

        // 클라이언트 코드에서 직접 new 객체 선언
        Car sedan = new Sedan();
        sedan.drive();

        Car SUV = new SUV();
        SUV.drive();

        /** 팩토리 메소드 적용 전
         * 확장이 어려움(새로운 Car 타입 추가) 시 클라이언트 코드 수정이 필요함
         * Car Truck = new Truck();
         * Truck.drive();
         */
    }
}