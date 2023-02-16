package cage;

import animals.Animal;
import animals.Wolf;

import java.util.ArrayList;
import java.util.Random;

public class WolfCage implements AnimalCage {
    private int cleanCage;
    private ArrayList<Wolf> wolfs;


    public WolfCage(ArrayList<Wolf> wolf) {
        this.wolfs = wolf;
    }


    @Override
    public String toString() {
        return "WolfCage: " +
                "cleanCage = " + cleanCage +
                ", wolfs:\n" + wolfs;
    }


    @Override
    public void addAnimal(Animal animal) {
        if (animal instanceof Animal)
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
        int length = wolfs.size();
        Random randoms = new Random();
        int ran = randoms.nextInt(length);

        for (int i = 0; i < length; i++) {
            if (i == ran) System.out.println(wolfs.get(i));
        }
    }


}
