package factory;

import animals.Wolf;
import java.util.ArrayList;
import java.util.Random;

public class WolfFactory {
    private int wolfCount;


    public static ArrayList<Wolf> createLions(int wolfCount) {

        Random random = new Random();
        ArrayList<Wolf> createLions = new ArrayList<>();

        for (int i = 0; i < wolfCount; i++) {
            int rand = random.nextInt(10);
            createLions.add(new Wolf(rand, rand, rand, rand));
        }
        return createLions;
    }
}
