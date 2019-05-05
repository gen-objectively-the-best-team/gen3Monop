package Game;

import Player.Player;

public class GoSquare extends Square {
    /**
     * Constructs a Square with a name
     *
     *
     */
    public GoSquare() {
        super("GO");
    }

    @Override
    public void landedOn(Player p) {
        p.addCash(200);
    }
}
