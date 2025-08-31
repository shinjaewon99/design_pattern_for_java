package structural.adapter.to_be;

class MicroUsbAdapter implements Charger {
    private final MicroUsbCharger microUsbCharger;

    public MicroUsbAdapter(MicroUsbCharger microUsbCharger) {
        this.microUsbCharger = microUsbCharger;
    }

    @Override
    public void charge() {
        microUsbCharger.chargeWithMicroUsb();
    }
}