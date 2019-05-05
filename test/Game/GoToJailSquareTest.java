package Game;

import Player.Player;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class GoToJailSquareTest {
    @Test
    public void goToJailSquareHasCorrectName(){
        GoToJailSquare gs = new GoToJailSquare("Nice name", new RegularSquare("test"));
        assertEquals("Nice name", gs.getName());
        assertNotEquals("Not nice name", gs.getName());
    }

    @Test
    public void goToJailBringPlayerToJail(){
        Board b = new Board();
        ArrayList<Die> dice = new ArrayList<>();
        dice.add(new Die());
        dice.add(new Die());

        RegularSquare jail = new RegularSquare("jail");
        GoToJailSquare gs = new GoToJailSquare("Nice name", jail);

        Player farouche = new Player("Farouche", "koala", b, dice);
        gs.landedOn(farouche);
        assertEquals(jail, farouche.getPiece().getLocation());
    }
}


