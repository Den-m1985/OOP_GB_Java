package animals;

public class Wolf extends Animal {
    protected int maneVolume;
    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Wolf";


    public Wolf(int year, int weight, int countLimbs, int maneVolume) {
        super(year, weight, countLimbs);
        this.maneVolume = maneVolume;
    }

    public int getManeVolume() {
        return maneVolume;
    }

    public void setManeVolume(int maneVolume) {
        this.maneVolume = maneVolume;
    }


    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }


    @Override
    public String getType() {
        return TYPE;
    }


    @Override
    public String toString() {
        return "Wolf {" +
                "maneVolume = " + maneVolume +
                ", year = " + year +
                ", weight = " + weight +
                ", countLimbs = " + countLimbs +
                "}\n";
    }

}
