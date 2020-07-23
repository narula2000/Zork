package io.muic.ooc.zork.command;

import io.muic.ooc.zork.Main;

public interface Command {

    /**
     * Override Method to run the command.
     * @param args - Command to execute.
     * @param state - State of the game.
     * @param player - Player Object.
     * @param world - World Object.
     */
    void execute(String[] args, Main.Status state, Player player, World world);
}
