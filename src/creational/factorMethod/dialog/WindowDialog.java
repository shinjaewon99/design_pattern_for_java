package creational.factorMethod.dialog;

import creational.factorMethod.Button;
import creational.factorMethod.WindowButton;

public class WindowDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new WindowButton();
    }
}
