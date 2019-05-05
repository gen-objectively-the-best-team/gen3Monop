package Player;

import Game.Board;
import Game.MockedCup;
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
        MockedCup cup = new MockedCup(6, 4);

        Player farouche = new Player("Farouche", "koala", b, cup);

        farouche.takeTurn();
        assertEquals(farouche.getPiece().getLocation(), b.getSquare(10));

    }
}
