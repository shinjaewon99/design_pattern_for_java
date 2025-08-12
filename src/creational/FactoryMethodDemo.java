package creational;

import creational.factorMethod.dialog.Dialog;
import creational.factorMethod.dialog.HtmlDialog;
import creational.factorMethod.dialog.WindowDialog;

public class FactoryMethodDemo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        renderingOs();
    }

    static void configure() {
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("win")) {
            dialog = new WindowDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void renderingOs() {
        dialog.renderWindow();
    }
}
