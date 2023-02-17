package factory;

import animals.Lion;

import java.util.ArrayList;
import java.util.Random;

public class LionsFactory {
    private int lionCount;

    public static ArrayList<Lion> createLions(int lionCount) {
        Random random = new Random();

        ArrayList<Lion> createLions = new ArrayList<>();
        for (int i = 0; i < lionCount; i++) {
            int rand1 = random.nextInt(10);
            int rand2 = random.nextInt(10);
            int rand3 = random.nextInt(10);
            int rand4 = random.nextInt(10);
            createLions.add(new Lion(rand1, rand2, rand3, rand4));
        }
        return createLions;
    }
}
