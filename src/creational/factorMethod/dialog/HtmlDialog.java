package creational.factorMethod.dialog;

import creational.factorMethod.Button;
import creational.factorMethod.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new HtmlButton();
    }
}
