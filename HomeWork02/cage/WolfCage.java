package cage;

import animals.Wolf;
import animals.WolfComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class WolfCage implements AnimalCage<Wolf> {
    private int cleanCage;
    //private double food;
    private ArrayList<Wolf> wolfs;

    /**
     * Create cage whith wolfs
     */
    public WolfCage(ArrayList<Wolf> wolf) {
        this.wolfs = wolf;

    }


    @Override
    public String toString() {
        return "WolfCage: " +
                "cleanCage = " + cleanCage +
                ", wolfs:\n" + wolfs ;
    }


    @Override
    public void addAnimal(Wolf animal) {
        wolfs.add(animal);
    }


    @Override
    public void setFeed(int weightFood) {
//        this.food = weightFood /wolfs.size();
//        System.out.println(food);
//        if (weightFood == 0) System.out.println("Were is the food?");
        // в клетку кидают еду, ее надо разделить на всех.

    }


    @Override
    public int cleanCase() {
        this.cleanCage = 0;
        return cleanCage;
    }

    /**
     * Get random wolf from cage.
     */
    @Override
    public List getRandomAnimal() {
        List<Wolf> wolfList = new ArrayList<>();
        int length = wolfs.size();
        Random randoms = new Random();
        int ran = randoms.nextInt(length);

        for (int i = 0; i < length; i++) {
            if (i == ran) wolfList.add(wolfs.get(i));
        }
        return wolfList;
    }

    /**
     * Sort wolves by weight
     */
    public void sortWeight() {
        wolfs.sort(new WolfComparator());
    }

    /**
     * Sort wolves by year
     */
    public void sortYear() {
        Collections.sort(wolfs);
    }


    public Wolf takeOfAnimal() {

        return null;
    }

}
