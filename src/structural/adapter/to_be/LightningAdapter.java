package structural.adapter.to_be;

class LightningAdapter implements Charger {
    private final LightningCharger lightningCharger;

    public LightningAdapter(LightningCharger lightningCharger) {
        this.lightningCharger = lightningCharger;
    }

    @Override
    public void charge() {
        lightningCharger.chargeWithLightning();
    }
}