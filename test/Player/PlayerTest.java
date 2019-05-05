package Player;

import Game.Board;
import Game.Die;
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
        dice.add(new Die());
        dice.add(new Die());

        Player farouche = new Player("Farouche", "koala", b, dice);

        farouche.takeTurn();
        farouche.takeTurn();

    }

}
