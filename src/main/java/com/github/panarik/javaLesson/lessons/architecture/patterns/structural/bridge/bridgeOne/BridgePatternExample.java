package com.github.panarik.javaLesson.lessons.architecture.patterns.structural.bridge.bridgeOne;

import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.bridge.bridgeOne.devices.DVDDevice;
import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.bridge.bridgeOne.devices.TVDevice;
import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.bridge.bridgeOne.remoteControllers.AbstractRemoteController;
import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.bridge.bridgeOne.remoteControllers.DVDRemote;
import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.bridge.bridgeOne.remoteControllers.TVRemoteMute;
import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.bridge.bridgeOne.remoteControllers.TVRemotePause;

/**
 * This class defines control system for any types of devices from any types of controllers.
 */
public class BridgePatternExample {

    public static void main(String[] args) {

        AbstractRemoteController tv1 = new TVRemoteMute(new TVDevice(1, 10));
        AbstractRemoteController tv2 = new TVRemotePause(new TVDevice(5, 50));
        AbstractRemoteController dvd = new DVDRemote(new DVDDevice(1, 10)); // can be implemented else.

        System.out.println("Test TV with mute.");
        tv1.buttonFivePressed();
        tv1.buttonSixPressed();
        tv1.buttonNinePressed(); // It's mute acton for TV1.

        System.out.println("\nTest TV with pause.");
        tv2.buttonFivePressed();
        tv2.buttonSixPressed();
        tv2.buttonNinePressed(); // It's pause acton for TV2.

        System.out.println("\nTest DVD player.");
        dvd.buttonFivePressed();
        dvd.buttonSixPressed();
        dvd.buttonNinePressed();
    }

}
