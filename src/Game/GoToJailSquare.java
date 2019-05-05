package Game;

import Player.Player;

public class GoToJailSquare extends Square {
    Square jail;
    /**
     * Constructs a Square with a name
     *
     * @param name String name
     */
    public GoToJailSquare(String name,Square j) {
        super(name);
        jail=j;
    }

    @Override
    public void landedOn(Player p) {
        p.setLocation(jail);
    }
}
