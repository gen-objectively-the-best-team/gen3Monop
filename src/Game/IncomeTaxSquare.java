package Game;

import Player.Player;

public class IncomeTaxSquare extends Square {
    /**
     * Constructs a Square with a name
     *
     * @param name String name
     */
    public IncomeTaxSquare(String name) {
        super(name);
    }

    @Override
    public void landedOn(Player p) {
        int w= p.getNetWorth();
        p.reduceCash(Math.min((int) (w*0.1f),200));
    }
}
