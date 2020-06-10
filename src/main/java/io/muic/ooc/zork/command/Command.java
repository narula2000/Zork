package io.muic.ooc.zork.command;

public interface Command {

    /**
     * Override Method to run the command.
     * @param arg - Command to execute.
     */
    void execute(String arg);

}
