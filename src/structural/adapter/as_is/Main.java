package structural.adapter.as_is;

public class Main {
    public static void main(String[] args) {
        UsbCCharger usbC = new UsbCCharger();
        usbC.chargeWithUsbC();

        MicroUsbCharger microUsb = new MicroUsbCharger();
        // microUsb.chargeWithUsbC(); // 컴파일 에러
    }
}