package creational.abstractFactory;

import creational.abstractFactory.component.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("create WindowsButton");
    }
}
