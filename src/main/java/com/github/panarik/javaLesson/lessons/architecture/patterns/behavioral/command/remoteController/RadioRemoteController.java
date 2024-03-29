package com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.command.remoteController;

import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.command.deviceReceiver.Radio;
import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.command.deviceReceiver.Device;

/**
 * Define remote controller which will send commands to radio receiver.
 * Remote controller doesn't know anything about how radio player works.
 */
public class RadioRemoteController {

    /**
     * Getting exact radio receiver which needed for operating.
     *
     * @return target radio receiver.
     */
    public static Device getDevice() {
        return new Radio();
    }

}
