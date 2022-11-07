package src.models.commands;

import src.models.appliances.Light;

public class LightOffCommand implements HomeCommand {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
