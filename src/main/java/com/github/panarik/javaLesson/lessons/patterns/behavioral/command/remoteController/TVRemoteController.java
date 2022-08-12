package com.github.panarik.javaLesson.lessons.patterns.behavioral.command.remoteController;

import com.github.panarik.javaLesson.lessons.patterns.behavioral.command.deviceReceiver.Device;
import com.github.panarik.javaLesson.lessons.patterns.behavioral.command.deviceReceiver.Television;

/**
 * Define remote controller which will send commands to TV.
 * Remote controller doesn't know anything about how TV receiver works.
 */
public class TVRemoteController {

    /**
     * Getting exact TV which needed for operating.
     *
     * @return target TV receiver.
     */
    public static Device getDevice() {
        return new Television();
    }

}
