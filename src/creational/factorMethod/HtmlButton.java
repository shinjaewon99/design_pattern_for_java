package creational.factorMethod;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>HTML Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("HTML Button: Clicked!");
    }
}
