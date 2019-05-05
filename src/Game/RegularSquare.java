package Game;

import Player.Player;

public class RegularSquare extends Square{
    /**
     * Constructs a Square with a name
     *
     * @param name String name
     */
    public RegularSquare(String name) {
        super(name);
    }

    @Override
    public void landedOn(Player p) {    }
}
