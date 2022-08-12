package com.github.panarik.javaLesson.lessons.patterns.behavioral.command.commands;

import com.github.panarik.javaLesson.lessons.patterns.behavioral.command.deviceReceiver.Device;

/**
 * Turns OFF any device.
 */
public class TurnOffCommand implements Command {

    Device device; // Any device can be putted here.

    public TurnOffCommand(Device device) {
        this.device = device;
    }

    /**
     * Turn TV OFF.
     */
    public void execute() {
        device.off();
    }

}
