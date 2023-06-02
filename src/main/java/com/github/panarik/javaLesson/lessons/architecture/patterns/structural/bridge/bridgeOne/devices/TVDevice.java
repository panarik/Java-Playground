package com.github.panarik.javaLesson.lessons.architecture.patterns.structural.bridge.bridgeOne.devices;


/**
 * Defines TV device.
 */
public class TVDevice extends AbstractDevice {

    public TVDevice(int currentChanel, int maxChannels) {
        this.deviceState = currentChanel;
        this.maxState = maxChannels;
    }

    /**
     * Scroll channel down.
     */
    public void buttonFivePressed() {
        deviceState--;
        System.out.println("Channel down");
        deviceFeedback();
    }

    /**
     * Scroll channel up.
     */
    public void buttonSixPressed() {
        deviceState++;
        System.out.println("Channel up.");
        deviceFeedback();
    }

}
