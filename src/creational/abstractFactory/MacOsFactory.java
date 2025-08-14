package creational.abstractFactory;

import creational.abstractFactory.component.Button;
import creational.abstractFactory.component.CheckBox;
import creational.abstractFactory.component.GUIFactory;

public class MacOsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacOsCheckBox();
    }
}
