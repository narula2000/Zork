package io.muic.ooc.zork.command.ingame;

import io.muic.ooc.zork.Main;
import io.muic.ooc.zork.command.Item;
import io.muic.ooc.zork.command.Player;
import io.muic.ooc.zork.command.World;

import java.util.List;

public class InfoCommand implements io.muic.ooc.zork.command.Command {
    /**
     * Override Method to run the command.
     *
     * @param args   - Command to execute.
     * @param state  - State of the game.
     * @param player - Player Object.
     * @param world - World Object.
     */
    @Override
    public void execute(String[] args, Main.Status state, Player player, World world) {
        if (state.equals(Main.Status.PLAYING)){
            System.out.print(player.currentDescription());
        }
    }
}
