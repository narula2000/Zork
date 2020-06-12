package io.muic.ooc.zork;

public class GameFlag {

    /**
     * Flag of the game state.
     *  true - Menu
     *  false - In-game
     */
    private boolean gameState = true;

    /**
     * Get the current game state.
     * @return - State of the game.
     */
    public boolean getState() {
        return gameState;
    }

    /**
     * Change the state of the game.
     * @return - not gameState
     */
    public boolean changeState() {
        gameState = false;
        return gameState;
    }
}
