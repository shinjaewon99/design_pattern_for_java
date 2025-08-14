package creational.abstractFactory;

import creational.abstractFactory.component.Button;

public class MacOsButton implements Button {
    @Override
    public void paint() {
        System.out.println("create MacOsButton");
    }
}
