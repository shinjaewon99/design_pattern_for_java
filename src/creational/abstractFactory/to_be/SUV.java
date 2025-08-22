package creational.abstractFactory.to_be;

public class SUV implements Car {
    @Override
    public void drive() {
        System.out.println("SUV를 운전");
    }
}