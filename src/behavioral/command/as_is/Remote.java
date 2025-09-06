package behavioral.command.as_is;

// 모든 구체 클래스에 직접 의존
public class Remote {
    private Light light = new Light();
    private Fan fan = new Fan();

    public void pressButton(String type) {
        if ("LIGHT_ON".equals(type)) {
            light.on();
        } else if ("LIGHT_OFF".equals(type)) {
            light.off();
        } else if ("FAN_ON".equals(type)) {
            fan.on();
        } else if ("FAN_OFF".equals(type)) {
            fan.off();
        }
        // 새로운 기기(예: TV)가 추가되면?
        // if-else에 TV_ON, TV_OFF 추가 -> Remote 코드 수정 필수
    }
}