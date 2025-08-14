package creational.abstractFactory;

import creational.abstractFactory.component.CheckBox;

public class MacOsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("create MacOsCheckBox");
    }
}
