package com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.command;

import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.command.commands.TurnAllOffCommand;
import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.command.commands.TurnOnCommand;
import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.command.commands.TurnUpCommand;
import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.command.deviceReceiver.Device;
import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.command.remoteController.ButtonRemoteController;
import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.command.remoteController.RadioRemoteController;
import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.command.remoteController.TVRemoteController;

import java.util.Arrays;

/**
 * This class will send commands to TV using Command pattern.
 */
public class CommandPatternExample {

    public static void main(String[] args) {

        // Give TV receiver by using TV remote controller.
        // User just grab controller from TV.
        // TV has prepared for getting commands.
        Device tv = TVRemoteController.getDevice();

        // Radio has prepared for getting commands.
        Device radio = RadioRemoteController.getDevice();

        // Making possible commands in mind.
        TurnOnCommand tvOnCommand = new TurnOnCommand(tv); // User made decision about turning TV on.
        TurnOnCommand radioOnCommand = new TurnOnCommand(radio); // User made decision about turning radio on.
        TurnUpCommand tvUpCommand = new TurnUpCommand(tv); // User made decision about turning TV volume up.

        //Create remote controller button.
        ButtonRemoteController button;

        // TV turn ON.
        button = new ButtonRemoteController(tvOnCommand); // TV remote control button has been prepared with ON command.
        button.press(); // User press button.

        // Turn TV volume up.
        button = new ButtonRemoteController(tvUpCommand);
        button.press();
        button.press();
        button.press();
        button.press();

        // Turn Radio ON.
        button = new ButtonRemoteController(radioOnCommand);
        button.press();

        // Turn all devices OFF.
        TurnAllOffCommand turnAllOff = new TurnAllOffCommand(Arrays.asList(tv, radio));
        button = new ButtonRemoteController(turnAllOff);
        button.press();


    }

}
