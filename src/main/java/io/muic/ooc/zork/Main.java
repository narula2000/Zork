package io.muic.ooc.zork;

import io.muic.ooc.zork.command.Command;
import io.muic.ooc.zork.command.CommandFactory;

import java.util.Scanner;

public class Main {


    /**
     * Runs the game.
     * @param args - Empty.
     */
    public static void main(final String[] args) {

        Scanner scanner = new Scanner(System.in);
        String cmd;
        GameFlag state = new GameFlag();
        //noinspection InfiniteLoopStatement
        do {
            System.out.print("$> ");
            cmd = scanner.nextLine();
            String[] words = cmd.split(" ");
            Command command = CommandFactory.getCommand(words[0]);
            if (command != null) {
                command.execute(
                        words.length == 1 ? null : words[1],
                        state);
            }
        } while (true);
    }
}
