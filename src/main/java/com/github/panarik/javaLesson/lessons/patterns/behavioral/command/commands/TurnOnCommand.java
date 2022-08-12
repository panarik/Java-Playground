package com.github.panarik.javaLesson.lessons.patterns.behavioral.command.commands;

import com.github.panarik.javaLesson.lessons.patterns.behavioral.command.deviceReceiver.Device;

/**
 * Turns ON any device.
 */
public class TurnOnCommand implements Command {

    Device device; // Any device can be putted here.

    public TurnOnCommand(Device device) {
        this.device = device;
    }

    /**
     * Turn TV ON.
     */
    public void execute() {
        device.on();
    }

}
