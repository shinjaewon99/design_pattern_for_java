package creational.factorMethod;

public class WindowButton implements Button{
    @Override
    public void render() {
        System.out.println("[Windows Button]");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Windows Button: Clicked!");
    }
}
