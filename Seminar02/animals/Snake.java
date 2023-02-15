package animals;

public class Snake extends Animal {
    protected int bodyLength;
    protected static final int MAX_WEIGHT = 200;
    protected static final String TYPE = "Snake";

    public Snake(int year, int weight, int countLimbs, int bodyLength) {
        super(year, weight, countLimbs);
        this.bodyLength = bodyLength;
    }

    public int getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
    }


    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }
}
