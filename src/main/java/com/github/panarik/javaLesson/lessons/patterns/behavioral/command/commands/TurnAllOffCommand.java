package com.github.panarik.javaLesson.lessons.patterns.behavioral.command.commands;

import com.github.panarik.javaLesson.lessons.patterns.behavioral.command.deviceReceiver.Device;

import java.util.List;

/**
 * Turns OFF all devices.
 */
public class TurnAllOffCommand implements Command {

    List<Device> devices; // device operating list.

    // Add all device here for operating.
    public TurnAllOffCommand(List<Device> devices) {
        this.devices = devices;
    }

    /**
     * Turn OFF all devices from list.
     */
    public void execute() {
        for (Device device : devices) {
            device.off();
        }
    }
}
