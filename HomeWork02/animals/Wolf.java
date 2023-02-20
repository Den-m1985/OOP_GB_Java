package animals;

import java.util.Comparator;

public class Wolf extends Animal implements Comparable<Wolf> {
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


    @Override
    public int compareTo(Wolf o) {
        if (this.year > o.getYear())
            return 1;
        else if (this.year < o.getYear())
            return -1;
        else
            return 0;

        // https://stackoverflow.com/questions/369512/how-to-compare-objects-by-multiple-fields
//        return Comparator.comparing(Wolf::getYear)
//                .thenComparing(Wolf::getWeight)
//                .compare(this, o);
    }
}
