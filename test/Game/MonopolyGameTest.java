package Game;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MonopolyGameTest {

    @Test
    public void cantCreateAGameWithAnInvalidAmountOfPlayers(){
        assertThrows(IllegalArgumentException.class, ()-> new MonopolyGame(9));
        assertThrows(IllegalArgumentException.class, ()-> new MonopolyGame(1));

        
    }


}
