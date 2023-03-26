package com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.command.remoteController;

import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.command.commands.Command;

/**
 * Invoker with button which execute right command on remote device.
 * This remote controller starts new commands into receiver device.
 * The {@link ButtonRemoteController} knows nothing about any receivers.
 */
public class ButtonRemoteController {

    Command command;

    /**
     * This button created with specific command in parameter.
     * This {@link ButtonRemoteController} don't know about what exactly command may it be.
     *
     * @param command
     */
    public ButtonRemoteController(Command command) {
        this.command = command;
    }

    /**
     * Press remote device button for execute command into right receiver.
     */
    public void press() {
        command.execute(); // Press button.
    }

}
