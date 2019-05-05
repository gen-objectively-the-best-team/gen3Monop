package Game;

public class MockedDie extends Die {

    @Override
    public void roll(){}

    /**
     * Setter of the faceValue
     * @return
     */
    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }
}
