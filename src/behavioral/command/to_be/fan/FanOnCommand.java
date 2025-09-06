package behavioral.command.to_be.fan;

import behavioral.command.to_be.Command;

public class FanOnCommand implements Command {
    private Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on();
    }
}