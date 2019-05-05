package Game;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RegularSquareTest {
    @Test
    public void regularSquareHasCorrectName(){
        RegularSquare rs = new RegularSquare("Nice name");
        assertEquals("Nice name", rs.getName());
        assertNotEquals("Not nice name", rs.getName());
    }
}
