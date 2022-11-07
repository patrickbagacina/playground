package src.models;

import src.models.commands.*;
import java.lang.StringBuffer;

public class RemoteControl {
    public final int SLOTS = 7;
    HomeCommand[] onCommands;
    HomeCommand[] offCommands;
    HomeCommand undoCommand;

    public RemoteControl() {
        // there are 7 on/off button slots on the remote
        onCommands = new HomeCommand[SLOTS];
        offCommands = new HomeCommand[SLOTS];

        HomeCommand noCommand = new NoCommand();

        // all commands will be initially set to no command
        for (int a = 0; a < SLOTS; a++) {
            onCommands[a] = noCommand;
            offCommands[a] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, HomeCommand onCommand, HomeCommand offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\n------------------ Remote Controller ----------------------\n");

        for (int i = 0; i < SLOTS; i++) {
            buffer.append("[slot" + i + "] " + onCommands[i].getClass().getName() + "    "
                    + offCommands[i].getClass().getName() + "\n");
        }

        buffer.append("[undo] " + undoCommand.getClass().getName());

        return buffer.toString();
    }
}
