package Game;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class MonopolyGameTest {

    @Test
    public void cantCreateAGameWithAnInvalidAmountOfPlayers(){
        assertThrows(IllegalArgumentException.class, ()-> new MonopolyGame(9));
        assertThrows(IllegalArgumentException.class, ()-> new MonopolyGame(1));
    }

    @Test
    public void gameIsNotInfinite(){
        assertTimeout(Duration.ofSeconds(10), () -> {
            MonopolyGame game = new MonopolyGame(3);
            game.playGame();
        });
    }
}
