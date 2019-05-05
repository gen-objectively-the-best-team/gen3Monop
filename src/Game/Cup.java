package Game;

/**
 * Class representing a cup holding two dice
 * @author Guillaume Vetter & Luca Reis de Carvalho & Claude-André Alves
 */
public class Cup {
    private Die d1 = new Die();
    private Die d2 = new Die();

    /**
     * Method used to roll both dice
     */
    public void roll() {
        d1.roll();
        d2.roll();
    }

    /**
     * Method used to get total value of both dice
     * @return the total of both die
     */
    public int getTotal() {
        return d1.getFaceValue() + d2.getFaceValue();
    }

    /**
     * Getter of the first die
     * @return the first die
     */
    protected Die getFirstDie() {
        return d1;
    }

    /**
     * Getter of the second die
     * @return the second die
     */
    protected Die getSecondDie() {
        return d2;
    }
}
