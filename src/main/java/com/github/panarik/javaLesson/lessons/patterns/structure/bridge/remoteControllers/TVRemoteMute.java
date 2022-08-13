package com.github.panarik.javaLesson.lessons.patterns.structure.bridge.remoteControllers;

import com.github.panarik.javaLesson.lessons.patterns.structure.bridge.devices.AbstractDevice;

/**
 * Defines TV remote control button with action 'Mute TV'.
 */
public class TVRemoteMute extends AbstractRemoteController {

    public TVRemoteMute(AbstractDevice device) {
        super(device);
    }

    /**
     * Defines action 'Mute TV' after button 9 controller was pressed.
     */
    public void buttonNinePressed() {
        System.out.println("TV was muted.");
    }
}
