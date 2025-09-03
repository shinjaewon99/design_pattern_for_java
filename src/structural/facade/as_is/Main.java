package structural.facade.as_is;

// 클라이언트가 여러 객체들과 강하게 결합
// 각각 호출 해야됨
public class Main {
    public static void main(String[] args) {
        Washing washing = new Washing();
        Drum drum = new Drum();
        Drying drying = new Drying();

        // 사용자가 모든 절차를 알아야함
        washing.fill();
        drum.spin();
        drying.dry();
    }
}