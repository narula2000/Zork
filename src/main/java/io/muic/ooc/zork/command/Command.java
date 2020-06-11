package io.muic.ooc.zork.command;

import io.muic.ooc.zork.GameFlag;

public interface Command {

    /**
     * Override Method to run the command.
     * @param arg - Command to execute.
     * @param state - State of the game.
     */
    void execute(String arg, GameFlag state);
}
