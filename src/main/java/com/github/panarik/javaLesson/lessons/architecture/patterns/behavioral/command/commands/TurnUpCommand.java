package com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.command.commands;

import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.command.deviceReceiver.Device;

/**
 * Turns value UP for any device.
 */
public class TurnUpCommand implements Command {

    Device device; // Any device can be putted here.

    public TurnUpCommand(Device device) {
        this.device = device;
    }

    /**
     * Turn TV volume up.
     */
    public void execute() {
        device.volumeUp();
    }
}
