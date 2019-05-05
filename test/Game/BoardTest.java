package Game;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {
    static Board board;
    @BeforeAll
    static void BuildBoard(){
        board= new Board();
    }

    @Test
    void TheFirstSquareIsGo(){
        Square go= board.getSquare(0);
        assertEquals("GO",go.getName());
    }


}
