package Game;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;


public class DieTest {
    @RepeatedTest(100)
    public void dieHasValueBetweenOneAndSix() {
        Die d = new Die();
        d.roll();
        assertFalse(d.getFaceValue() < 1 || d.getFaceValue() > 6);
    }

    @Test
    public void dieHas0ValueAfterInit() {
        Die d = new Die();
        assertEquals(0, d.getFaceValue());
        d.roll();
        assertNotEquals(0, d.getFaceValue());
    }

    @Test
    public void dieHasEveryValueBetweenOneAndSix(){
        HashSet<Integer> faceValues = new HashSet<>();
        Die d = new Die();
        for(int i = 0; i < 1000; i++){
            d.roll();
            faceValues.add(d.getFaceValue());
        }

        assertTrue(faceValues.contains(1));
        assertTrue(faceValues.contains(2));
        assertTrue(faceValues.contains(3));
        assertTrue(faceValues.contains(4));
        assertTrue(faceValues.contains(5));
        assertTrue(faceValues.contains(6));
    }
}
