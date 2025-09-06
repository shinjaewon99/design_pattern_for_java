package behavioral.command.to_be;

import behavioral.command.to_be.fan.Fan;
import behavioral.command.to_be.fan.FanOnCommand;
import behavioral.command.to_be.light.Light;
import behavioral.command.to_be.light.LightOffCommand;
import behavioral.command.to_be.light.LightOnCommand;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();

        Command lightOn = new LightOnCommand(light);
        Command fanOn = new FanOnCommand(fan);
        Command lightOff = new LightOffCommand(light);


        Remote remote = new Remote();

        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(fanOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();
    }
}