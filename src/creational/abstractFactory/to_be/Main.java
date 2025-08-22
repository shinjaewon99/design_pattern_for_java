package creational.abstractFactory.to_be;

public class Main {
    public static void main(String[] args) {
        // 클라이언트는 new를 직접 쓰지 않고 Factory에 위임
        Car sedan = CarFactory.createCar("sedan");
        sedan.drive();

        Car suv = CarFactory.createCar("suv");
        suv.drive();

        Car undefinedCar = CarFactory.createCar("undefined Car");
        undefinedCar.drive();

        /**
         * 새로운 Car 타입 추가시 Factory만 수정하면 됨
         */
    }
}