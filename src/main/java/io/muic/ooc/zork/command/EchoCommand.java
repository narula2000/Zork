package io.muic.ooc.zork.command;

public final class EchoCommand implements Command {
    @Override
    public void execute(final String arg) {
        System.out.printf("You typed: %s \n", arg);
    }
}
