package Game;

import Player.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class GoSquareTest {
    @Test
    public void goSquareHasCorrectName(){
        GoToJailSquare gs = new GoToJailSquare("Nice name", new RegularSquare("test"));
        assertEquals("Nice name", gs.getName());
        assertNotEquals("Not nice name", gs.getName());
    }

    @Test
    public void goSquareGiveMoney(){
        Player p = new Player("jean");
        GoSquare gs = new GoSquare();

        gs.landedOn(p);
        assertEquals(1700, p.getNetWorth());
    }
}
