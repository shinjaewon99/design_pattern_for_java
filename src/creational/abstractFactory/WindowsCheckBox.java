package creational.abstractFactory;

import creational.abstractFactory.component.CheckBox;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("create WindowsCheckBox");
    }
}
