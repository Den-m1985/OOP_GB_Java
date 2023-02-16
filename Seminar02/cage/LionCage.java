package cage;

import animals.Animal;
import animals.Lion;

import java.util.ArrayList;

public class LionCage implements AnimalCage {
    private int cleanCage;
    private ArrayList <Lion> lions;

    public LionCage(ArrayList <Lion>lions) {
        //this.lions = new ArrayList<Lion>();
        this.lions = lions;
    }

    @Override
    public String toString() {
        return "LionCage{" +
                "cleanCage=" + cleanCage +
                ", lions=" + lions +
                '}';
    }

    @Override
    public void addAnimal(Animal animal) {
        // добавить проверку на instance off ?
        lions.add((Lion) animal);
    }

    @Override
    public int setFeed(int weightFood) {
        // в клетку кидают еду, ее надо разделить на всех.
        int lionFeed = weightFood / lions.size();
        return lionFeed;
    }

    @Override
    public int cleanCase() {
        this.cleanCage = 0;
        return cleanCage;
    }
}
