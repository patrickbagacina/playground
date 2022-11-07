package src.models.commands;

import src.models.appliances.Light;

public class LightOnCommand implements HomeCommand {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
