package com.github.panarik.javaLesson.lessons.architecture.patterns.structural.bridge.bridgeOne.remoteControllers;

import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.bridge.bridgeOne.devices.AbstractDevice;

/**
 * Abstract device represents remote controller for any device.
 */
public abstract class AbstractRemoteController {

    /**
     * This is a bridge. This field provides any device to any controller.
     */
    AbstractDevice device;

    public AbstractRemoteController(AbstractDevice device) {
        this.device = device;
    }

    /**
     * Abstract action for button 9 controller.
     */
    public abstract void buttonNinePressed();

    /**
     * Call button 5 on device by remote controller.
     */
    public void buttonFivePressed() {
        device.buttonFivePressed();
    }

    /**
     * Call button 6 on device by remote controller.
     */
    public void buttonSixPressed() {
        device.buttonSixPressed();
    }

}
