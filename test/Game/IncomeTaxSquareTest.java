package Game;
import Player.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class IncomeTaxSquareTest {
    @Test
    public void incomeTaxHasCorrectName(){
        IncomeTaxSquare its = new IncomeTaxSquare("Nice name");
        assertEquals("Nice name", its.getName());
        assertNotEquals("Not nice name", its.getName());
    }

    @Test
    public void landedOnTaxRemoveMinTwoHundred(){
        IncomeTaxSquare its = new IncomeTaxSquare("hello");
        Player p = new Player("jean");
        its.landedOn(p);
        assertNotEquals(1500, p.getNetWorth());
        assertEquals(1350, p.getNetWorth());


    }

    @Test
    public void landedOnTaxRemoveTenPercent(){
        IncomeTaxSquare its = new IncomeTaxSquare("hello");
        Player p = new Player("jean");
        p.addCash(1000);
        its.landedOn(p);
        assertEquals(2300, p.getNetWorth());
    }
}
