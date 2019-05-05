package Game;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CupTest {

    @Test
    public void cupReturnTotalOfBothDice(){
        Cup cup = new Cup();
        assertEquals(cup.getTotal(), cup.getFirstDie().getFaceValue() + cup.getSecondDie().getFaceValue());
    }
}
