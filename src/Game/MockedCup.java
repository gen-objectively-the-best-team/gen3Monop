package Game;

public class MockedCup extends Cup {
    private MockedDie d1;
    private MockedDie d2;
    public MockedCup(int value1, int value2) {
        d1 = new MockedDie();
        d1.setFaceValue(value1);
        d2 = new MockedDie();
        d2.setFaceValue(value2);
    }
    @Override
    public void roll() {

    }
    @Override
    public int getTotal() {
        return d1.getFaceValue() + d2.getFaceValue();
    }

}
