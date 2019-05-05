package Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class SquareTest {

    @Test
    void SquareReturnsCorrectName(){
        Square s = new RegularSquare("Go");
        assertEquals(s.getName(),"Go");

        Square s12 = new RegularSquare("Square 12");
        assertEquals(s12.getName(),"Square 12");
    }
}
