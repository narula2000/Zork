package io.muic.ooc.zork.command;

public class Item {
    /**
     * Name of the item.
     */
    private String name = "Default item name";
    /**
     * Attack damage of the item.
     */
    private int damage = 0;


    /**
     * Empty constructor.
     */
    public Item() {

    }

    /**
     * Fetch name of the item.
     * @return - String of the item name.
     */
    public String name() {
        return this.name;
    }

    /**
     * Write the name of the item.
     * @param newName - Name th change to.
     * @return - Item with new name.
     */
    public Item name(final String newName) {
        this.name = newName;
        return this;
    }

    /**
     * Drop the item of the player and ad to the map.
     * @param map - Map to add item too.
     */
    public void drop(final Map<?> map) {
            map.addItem(this);
            /*
                TODO
                remove item of the player.
             */
    }

    /**
     * Take item from the map.
     * @param map - Map to remove item from.
     */
    public void take(final Map<?> map) {
        map.removeItem(this);
        /*
        TODO
        add item to player.
         */
    }

    /**
     * Attack damage.
     * @return - Int of the damage
     */
    public int attack() {
        return this.damage;
    }

    /**
     * Change the damage of the item.
     * @param power - Change to what damage.
     * @return - Item with modified damage.
     */
    public Item attack(final int power) {
        this.damage = power;
        return this;
    }

}
