package Player;

import Game.Board;
import Game.Die;
import Game.MockedDie;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    public void testPlayerGetName() {
        Player p1 = new Player("John");
        assertEquals("John", p1.getName());
        assertNotEquals("john", p1.getName());
    }

    @Test
    public void testTakeTurn() {
        Board b = new Board();
        ArrayList<Die> dice = new ArrayList<>();
        dice.add(new MockedDie());
        dice.add(new MockedDie());
        ((MockedDie) dice.get(0)).setFaceValue(6);
        ((MockedDie) dice.get(1)).setFaceValue(4);

        Player farouche = new Player("Farouche", "koala", b, dice);

        farouche.takeTurn();
        assertEquals(farouche.getPiece().getLocation(), b.getSquare(10));

    }
}
