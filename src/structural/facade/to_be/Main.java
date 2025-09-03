package structural.facade.to_be;

public class Main {
    public static void main(String[] args) {
        WashingMachineFacade washingMachine = new WashingMachineFacade();
        washingMachine.startWashing(); // 퍼사드 클래스 내부의 메소드를 호출
    }
}