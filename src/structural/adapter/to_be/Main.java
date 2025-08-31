package structural.adapter.to_be;

public class Main {
    public static void main(String[] args) {
        Charger usbC = new UsbCCharger();
        usbC.charge();

        // 어댑터 통해 Micro-USB 사용 가능
        Charger microUsbAdapter = new MicroUsbAdapter(new MicroUsbCharger());
        microUsbAdapter.charge();

        // 어댑터 통해 Lightning 사용 가능
        Charger lightningAdapter = new LightningAdapter(new LightningCharger());
        lightningAdapter.charge();
    }
}