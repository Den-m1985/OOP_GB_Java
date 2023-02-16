package cage;

import animals.Animal;
import animals.Wolf;

import java.util.ArrayList;

public class WolfCage implements AnimalCage {
    private int cleanCage;
    private ArrayList <Wolf> wolfs;

    public WolfCage(ArrayList <Wolf>wolf) {
        this.wolfs = wolf;
    }

    @Override
    public String toString() {
        return "WolfCage {" +
                "cleanCage = " + cleanCage +
                ", wolfs:\n" + wolfs +
                "}";
    }

    @Override
    public void addAnimal(Animal animal) {
        // добавить проверку на instance off ?
        wolfs.add((Wolf) animal);
    }

    @Override
    public int setFeed(int weightFood) {
        // в клетку кидают еду, ее надо разделить на всех.
        int wolfFeed = weightFood / wolfs.size();
        return wolfFeed;
    }

    @Override
    public int cleanCase() {
        this.cleanCage = 0;
        return cleanCage;
    }

    @Override
    public void getRandomAnimal() {
        for (Wolf wolf: this.wolfs) {
            System.out.println(wolf);
        }
    }
}
