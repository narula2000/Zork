package io.muic.ooc.zork.command.ingame;

import io.muic.ooc.zork.GameFlag;
import io.muic.ooc.zork.command.Command;

public class DropCommand implements Command {

    /**
     * Error Text.
     */
    String errorText =
            "=================================\n"
            + "Can't use this command in Menu\n"
            + "=================================\n";


    /**
     * Drop Item in player inventory.
     * @param args  - Command to execute.
     * @param state - State of the game.
     */
    @Override
    public void execute(final String[] args, final GameFlag state) {
            if (!state.getState()) {
                /*
                  TODO
                   check if item in inventory
                   remove item of player
                   add item to area item list
                 */
                System.out.println("Stage Change");
            } else {
                System.out.print(errorText);
            }
    }
}
