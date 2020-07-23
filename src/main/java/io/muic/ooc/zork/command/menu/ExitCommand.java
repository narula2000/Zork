package io.muic.ooc.zork.command.menu;

import io.muic.ooc.zork.Main;
import io.muic.ooc.zork.command.Command;
import io.muic.ooc.zork.command.Player;
import io.muic.ooc.zork.command.World;

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
     * @param player - Player Object.
     * @param world - World Object.
     */
    @Override
    public void execute(final String[] args, final Main.Status state, Player player, World world) {
        if (state.equals(Main.Status.MENU)) {
        System.out.println(exitText);
        System.exit(0);
    } else {
            System.out.println(errorText);
        }
    }
}
