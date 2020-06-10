package io.muic.ooc.zork.command;

import java.util.HashMap;
import java.util.Map;

public final class CommandFactory {

    /**
     * Empty constructor.
     */
    private CommandFactory() {

    }

    /**
     * Store the command to its command execution.
     */
    private static final Map<String, Command> COMMAND_MAP = new HashMap<>();


    static {
        COMMAND_MAP.put("exit", new ExitCommand());
        COMMAND_MAP.put("echo", new EchoCommand());
    }

    /**
     *  Execute the command by sending to its class.
     * @param cmd - Command to execute.
     * @return Command
     */
    public static Command getCommand(final String cmd) {
       return COMMAND_MAP.get(cmd);
    }
}
