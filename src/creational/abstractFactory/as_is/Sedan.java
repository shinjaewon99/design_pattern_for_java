package creational.abstractFactory.as_is;

public class Sedan implements Car{
    @Override
    public void drive() {
        System.out.println("세단을 운전");
    }
}