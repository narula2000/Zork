package io.muic.ooc.zork.command;


import io.muic.ooc.zork.Main;

import java.util.ArrayList;
import java.util.List;

public class Player {
    /**
     * Hp of player.
     */
    private int hp;
    /**
     * Max Hp of the player.
     */
    private int maxHp;
    /**
     * Name of the player.
     */
    private String name;
    /**
     * Current map player is in.
     */
    private Map<?> currentArea;

    /**
     * Inventory of the player.
     */
    private final List<Item> inventory;
    /**
     * State of the player if died.
     */
    private Main.Status death;



    public Player(final int hp, final String name) {
        this.hp = hp;
        this.maxHp = hp;
        this.name = name;
        this.death = Main.Status.PLAYING;
        this.inventory = new ArrayList<>();
    }

    public String currentDescription() {
        final StringBuilder desc = new StringBuilder();
        final Map<?> currentArea = this.getCurrentMap();
        desc.append(currentArea.description());
        final List<Item> items = currentArea.items();
        desc.append(this.name);
        desc.append('\n');
        desc.append(" You have ").append(this.hp).append("Hp");
        desc.append('\n');
        desc.append("Your max Hp is ").append(this.maxHp).append("Hp");
        desc.append('\n');
        List<Item> inven = this.getInventory();
        if (inven.size() > 0){
            desc.append("You have: ");
            for (final Item item : inven){
                desc.append('\n');
                desc.append(item.name());
            }
        }
        desc.append('\n');
        if (items.size() > 0) {
            desc.append("This Area contains: ");
            for (final Item item : items) {
                desc.append('\n');
                desc.append(item.name());
            }
        }
    return desc.toString();
    }

    /**
     * Get the current map.
     * @return - Map
     */
    public Map<?> getCurrentMap() {
            return this.currentArea;
    }

    /**
     * Get name of the player.
      * @return - String name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Rename the player.
     * @param newName - String new name
     */
    public void rename(final String newName) {
        this.name = newName;
    }

    public void addItem(final Item item) {
        this.inventory.add(item);
    }

    public void removeItem(final Item item) {
        this.inventory.remove(item);
    }

    /**
     * Check if player have an item.
     * @param name - Name of the item
     * @return - Boolean
     */
    public boolean hasItem(final String name) {
        for (final Item item : this.getInventory()) {
            if (item.name().equals(name)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Return inventory of the player.
     * @return - List of item.
     */
    public List<Item> getInventory() {
        return this.inventory;
    }

    /**
     * Chage the map
     * @param area - Map to change to,
     */
    public void setCurrentMap(final Map<?> area) {
        this.currentArea = area;
    }

    /**
     * Set player Hp.
     * @param n - new player Hp.
     */
    public void setHp(final int n) {
        this.hp = n;
    }

    /**
     * Get Hp of the player.
     * @return - Int of player Hp.
     */
    public int getHp() {
        return this.hp;
    }

    /**
     * Increase the player by n.
     * @param n - Amount to increase.
     */
    public void addHp(final int n) {
        this.hp += n;
    }

    /**
     * Set Max Hp of player.
     * @param n - Max Hp of player.
     */
    public void setMaxHp(final int n) {
        this.maxHp = n;
    }

    /**
     * Get max Hp of the player.
     * @return - Int of max Hp.
     */
    public int getMaxHp() {
        return this.maxHp;
    }

    /**
     * Kill the player.
     * @param death - State of the player
     */
    public void setDeath(Main.Status death) {
        death = Main.Status.DIE;
        this.death = death;
    }

    /**
     * Get status if player died.
     * @return - State
     */
    public Main.Status getDeath() {
        return this.death;
    }
}
