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
            int rand1 = random.nextInt(2000, 2023);  // год
            int rand2 = random.nextInt(1, 50);   // вес

            int rand4 = random.nextInt(10);  // объем гривы
            createLions.add(new Wolf(rand1, rand2, 4, rand4));
        }
        return createLions;
    }

}
