package structural.adapter.to_be;

class UsbCCharger implements Charger {
    @Override
    public void charge() {
        System.out.println("USB-C 케이블로 충전 중...");
    }
}