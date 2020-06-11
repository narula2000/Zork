package io.muic.ooc.zork.command.menu;

import io.muic.ooc.zork.GameFlag;
import io.muic.ooc.zork.command.Command;

public final class ExitCommand implements Command {
    @Override
    public void execute(final String arg, final GameFlag state) {
        if (state.getState()) {
        System.out.println("Bye");
        System.exit(0);
    } else {
            System.out.println("Can't use this command in-game");
        }
    }
}
