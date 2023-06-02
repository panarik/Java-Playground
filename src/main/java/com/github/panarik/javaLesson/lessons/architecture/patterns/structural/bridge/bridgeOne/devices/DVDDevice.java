package com.github.panarik.javaLesson.lessons.architecture.patterns.structural.bridge.bridgeOne.devices;

/**
 * Defines DVD player.
 */
public class DVDDevice extends AbstractDevice {

    public DVDDevice(int currentChapter, int maxChapters) {
        this.deviceState = currentChapter; // current chapter of movie.
        this.maxState = maxChapters; // max chapters in current movie.
    }

    /**
     * Go to the previous chapter of movie.
     */
    public void buttonFivePressed() {
        this.deviceState--;
        System.out.println("Go to the previous chapter of movie.");
        deviceFeedback();
    }

    /**
     * Go to the next chapter of movie.
     */
    public void buttonSixPressed() {
        this.deviceState++;
        System.out.println("Go to the next chapter of movie.");
        deviceFeedback();
    }

}
