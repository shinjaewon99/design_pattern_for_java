package behavioral.command.to_be.fan;

import behavioral.command.to_be.Command;

public class FanOffCommand implements Command {
    private Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.off();
    }
}