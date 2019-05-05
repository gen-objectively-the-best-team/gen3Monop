package Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PieceTest {
    @Test
    public void testPieceGetName() {
        Piece p1 = new Piece("Pony", new RegularSquare("Go"));
        assertEquals("Pony", p1.getName());
        assertNotEquals("Cat", p1.getName());
    }
    @Test
    public void testPieceGetLocation() {
        Piece p = new Piece("Knight", new RegularSquare("Go"));
        assertEquals("Go", p.getLocation().getName());
        assertNotEquals("NotGo", p.getLocation().getName());
    }
    @Test
    public void testPieceSetLocation() {
        Piece p = new Piece("Knight", new RegularSquare("Go"));
        p.setLocation(new RegularSquare("NotGo"));
        assertEquals("NotGo", p.getLocation().getName());
        assertNotEquals("Go", p.getLocation().getName());

    }
}
