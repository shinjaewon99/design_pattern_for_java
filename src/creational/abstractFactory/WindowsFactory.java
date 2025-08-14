package creational.abstractFactory;

import creational.abstractFactory.component.Button;
import creational.abstractFactory.component.CheckBox;
import creational.abstractFactory.component.GUIFactory;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsCheckBox();
    }
}
