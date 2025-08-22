package creational.abstractFactory.to_be;

public class KFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new KEngine();
    }

    @Override
    public Tire createTire() {
        return new KTire();
    }
}