package creational.abstractFactory.to_be;

public class CarFactory {
    // 팩토리 메소드
    public static Car createCar(String carType){
        return switch (carType) {
            case "sedan" -> new Sedan();
            case "suv" -> new SUV();
            default -> throw new IllegalArgumentException("알 수 없는 자동차 타입: " + carType);
        };
    }
}