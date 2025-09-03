package structural.facade.to_be;

public class WashingMachineFacade {
    private final Washing water = new Washing();
    private final Drum drum = new Drum();
    private final Drying dry = new Drying();

    public void startWashing() {
        System.out.println("=== 세탁 시작 ===");
        water.fill();
        drum.spin();
        dry.dry();
        System.out.println("=== 세탁 완료 ===");
    }
}