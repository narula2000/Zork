package io.muic.ooc.zork.command.menu;

import io.muic.ooc.zork.GameFlag;
import io.muic.ooc.zork.command.Command;

public final class ExitCommand implements Command {
    /**
     * Exit Text.
     */
    String exitText =
            "========================\n"
            + "  Thank you for playing\n"
            +  "        Goodbye!!!\n"
            + "========================";

    /**
     * Error Text.
     */
    String errorText =
            "==============================\n"
            + "Can't use this command in-game\n"
            + "==============================\n";
    /**
     * Exit off the game.
     * @param args - Command to execute.
     * @param state - State of the game.
     */
    @Override
    public void execute(final String[] args, final GameFlag state) {
        if (state.getState()) {
        System.out.println(exitText);
        System.exit(0);
    } else {
            System.out.println(errorText);
        }
    }
}
