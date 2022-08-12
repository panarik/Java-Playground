package com.github.panarik.javaLesson.lessons.patterns.behavioral.command.deviceReceiver;

import com.github.panarik.javaLesson.lessons.patterns.behavioral.command.remoteController.TVRemoteController;

/**
 * Abstract receiver device like Television and e.t.c.
 * This device will receive command from {@link TVRemoteController}.
 */
public interface Device {

    void on();

    void off();

    void volumeUp();

    void volumeDown();

}
