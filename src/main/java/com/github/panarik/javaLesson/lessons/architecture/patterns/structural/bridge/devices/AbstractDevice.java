package com.github.panarik.javaLesson.lessons.architecture.patterns.structural.bridge.devices;

/**
 * Abstract device represents some TV or video player or media player or radio player e.t.c.
 */
public abstract class AbstractDevice {

    protected int deviceState; // Current channel or current chapter of some content.
    protected int maxState; // Maximum numbers of channel or maximum chapters of some content.
    protected int volumeSettings = 0; // Current volume settings.

    /**
     * Abstract action for button 5 controller.
     */
    public abstract void buttonFivePressed();

    /**
     * Abstract action for button 6 controller.
     */
    public abstract void buttonSixPressed();

    /**
     * Represents device feedback with current abstract state.
     */
    public void deviceFeedback() {
        if (deviceState > maxState || deviceState < 1) deviceState = 1;
        System.out.println("On " + deviceState);
    }

    /**
     * Defines action after button 7 controller was pressed.
     * Increase device sound volume to 1.
     * Max volume is 100.
     */
    public void buttonSevenPressed() {
        if (volumeSettings <= 100) volumeSettings++;
        System.out.println("Volume at: " + volumeSettings);
    }

    /**
     * Defines action after button 8 controller was pressed.
     * Decrease device sound volume to 1.
     * Min volume is 0.
     */
    public void volumeEightPressed() {
        if (volumeSettings >= 0) volumeSettings--;
        System.out.println("Volume at: " + volumeSettings);
    }

}
