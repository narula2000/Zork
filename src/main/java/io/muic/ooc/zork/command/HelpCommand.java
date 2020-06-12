package io.muic.ooc.zork.command;

import io.muic.ooc.zork.GameFlag;

public class HelpCommand implements Command {

    /**
     * Help text output.
     */
    private final String helpText = "\n"
            + "========================\n"
            + "   help - Print out all command.\n"
            + "========================\n"
            + "      Menu Command\n"
            + "========================\n"
            + "   exit - Exit of the game.\n"
            + "   play {map-name} - Load the map\n"
            + "   load {saved-point-name} - Load save file\n"
            + "========================\n"
            + "      In-game Command\n"
            + "========================\n"
            + "   info - Give players and current map details.\n"
            + "   take {item} - Pick up item in the room.\n"
            + "   drop {item} - Drop an item in the inventory.\n"
            + "   attack with {item} - Attack with an item.\n"
            + "   go {direction} - Move north, south, east, west.\n"
            + "   map - Show the map.\n"
            + "   autopilot {file} - Run the game by the input file.\n"
            + "   quit - Exit back to Menu.\n"
            + "   save {name} - Save the game.\n"
            + "========================\n";

    /**
     * Print out all command and it's uses.
     * @param args  - Command to execute.
     * @param state - State of the game.
     */
    @Override
    public void execute(final String[] args, final GameFlag state) {
        System.out.print(helpText);
    }
}
