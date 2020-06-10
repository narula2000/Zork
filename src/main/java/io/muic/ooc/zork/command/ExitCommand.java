package io.muic.ooc.zork.command;

public final class ExitCommand implements Command {
    @Override
    public void execute(final String arg) {
        System.out.println("Bye");
        System.exit(0);
    }
}
