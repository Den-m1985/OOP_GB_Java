package cage;

import animals.Animal;
import animals.Lion;
import java.util.ArrayList;
import java.util.Collections;

public class LionCage implements AnimalCage<Lion> {
    private int cleanCage;
    private ArrayList <Lion> lions;

    public LionCage(ArrayList <Lion>lions) {
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
    public void addAnimal(Lion animal) {
        lions.add(animal);
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

    // Семинар 3
    public  void  sortLions(){
        Collections.sort(lions);
    }

    public  void  sortVolume(){

        Collections.sort(lions);
    }
}
