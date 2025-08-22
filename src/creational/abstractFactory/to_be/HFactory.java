package creational.abstractFactory.to_be;

public class HFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new HEngine();
    }

    @Override
    public Tire createTire() {
        return new HTire();
    }
}