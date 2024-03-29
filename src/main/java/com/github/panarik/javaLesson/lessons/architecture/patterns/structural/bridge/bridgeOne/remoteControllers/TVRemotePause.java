package com.github.panarik.javaLesson.lessons.architecture.patterns.structural.bridge.bridgeOne.remoteControllers;

import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.bridge.bridgeOne.devices.AbstractDevice;

/**
 * Defines TV remote control button with action 'Pause TV'.
 */
public class TVRemotePause extends AbstractRemoteController {


    public TVRemotePause(AbstractDevice device) {
        super(device);
    }

    /**
     * Defines action 'Pause TV' after button 9 controller was pressed.
     */
    public void buttonNinePressed() {
        System.out.println("TV was paused.");
    }

}
