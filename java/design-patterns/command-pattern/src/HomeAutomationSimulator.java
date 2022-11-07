package src;

import src.models.*;
import src.models.appliances.*;
import src.models.commands.*;

public class HomeAutomationSimulator {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // initialize appliances
        Light livingRoomLight = new Light("Living Room");
        CeilingFan kitchenFan = new CeilingFan("Kitchen");

        // initialize commands
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        CeilingFanHighCommand kitchenFanHigh = new CeilingFanHighCommand(kitchenFan);
        CeilingFanMediumCommand kitchenFanMedium = new CeilingFanMediumCommand(kitchenFan);
        CeilingFanLowCommand kitchenFanLow = new CeilingFanLowCommand(kitchenFan);
        CeilingFanOffCommand kitchenFanOff = new CeilingFanOffCommand(kitchenFan);

        remoteControl.setCommand(1, kitchenFanHigh, kitchenFanOff);
        remoteControl.setCommand(2, kitchenFanMedium, kitchenFanOff);
        remoteControl.setCommand(3, kitchenFanLow, kitchenFanOff);

        System.out.println(remoteControl.toString());

        // turn on then off lights
        remoteControl.onButtonPressed(0);
        remoteControl.offButtonPressed(0);

        System.out.println(remoteControl.toString());

        remoteControl.onButtonPressed(1);
        remoteControl.onButtonPressed(3);
        remoteControl.offButtonPressed(2);

        System.out.println(remoteControl.toString());
    }
}
