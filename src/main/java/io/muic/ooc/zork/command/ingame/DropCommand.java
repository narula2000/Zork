package io.muic.ooc.zork.command.ingame;

import com.sun.corba.se.spi.ior.IORTemplate;
import io.muic.ooc.zork.Main;
import io.muic.ooc.zork.command.Command;
import io.muic.ooc.zork.command.Item;
import io.muic.ooc.zork.command.Player;
import io.muic.ooc.zork.command.World;

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
     * @param player - Object of player.
     * @param world - Object of world.
     */
    @Override
    public void execute(final String[] args, final Main.Status state, Player player, World world) {
            if (state.equals(Main.Status.PLAYING)) {
                Item item = new Item().name(args[2]);
                if (item != null){
                    player.removeItem(item);
                    world.getMap(player.getCurrentMap()).addItem(item);
                    System.out.println("You have drop" + item.name() + "!!" );
                }
            } else {
                System.out.print(errorText);
            }
    }
}
