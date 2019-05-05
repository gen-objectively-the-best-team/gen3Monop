package Game;

import java.util.Random;

/**
 * Class representing a die that can be rolled. faceValue is equal to 0 when initialized.
 * @author Guillaume Vetter & Luca Reis de Carvalho & Claude-André Alves
 */
public class Die {
    /**
     * Value initialized to 0 when the dice has not been rolled yet.
     */
    private int faceValue = 0;

    /**
     * Constructor
     */
    public Die(){}

    /**
     * Roll method, used to set the faceValue at random between 1 and 6
     */
    public void roll(){
        Random r = new Random();
        faceValue = r.nextInt(6) + 1;
    }

    /**
     * Getter of the faceValue
     * @return the faceValue
     */
    public int getFaceValue() {
        return faceValue;
    }
}
