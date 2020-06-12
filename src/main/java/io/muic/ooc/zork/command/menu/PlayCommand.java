package io.muic.ooc.zork.command.menu;

import io.muic.ooc.zork.GameFlag;
import io.muic.ooc.zork.command.Command;

public class PlayCommand implements Command {

    /**
     * Error Text.
     */
    String errorText =
            "==============================\n"
            + "Can't use this command in-game\n"
            + "==============================\n";

    /**
     * Override Method to run the command.
     *
     * @param args  - Command to execute.
     * @param state - State of the game.
     */
    @Override
    public void execute(final String[] args, final GameFlag state) {
        if (state.getState()) {
            /* TODO
                Implement map file
            */
            state.changeState();
        } else {
            System.out.print(errorText);
        }
    }
}
