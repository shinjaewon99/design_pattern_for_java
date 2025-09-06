package behavioral.command.as_is;

public class Main {
    public static void main(String[] args) {
        Remote remote = new Remote();
        remote.pressButton("LIGHT_ON");
        remote.pressButton("FAN_ON");
        remote.pressButton("LIGHT_OFF");
    }
}