package com.github.panarik.javaLesson.lessons.architecture.patterns.structural.bridge.remoteControllers;

import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.bridge.devices.AbstractDevice;

/**
 * Defines DVD remote control button with action 'Go to menu'.
 */
public class DVDRemote extends AbstractRemoteController {

    public DVDRemote(AbstractDevice device) {
        super(device);
    }

    /**
     * Defines action 'Go to menu' after button 9 controller was pressed.
     */
    public void buttonNinePressed() {
        System.out.println("DVD menu was opened.");
    }

}
