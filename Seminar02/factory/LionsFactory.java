package factory;

import animals.Lion;

import java.util.ArrayList;

public class LionsFactory {
    private int lionCount;

    public static ArrayList<Lion> createLions(int lionCount) {
        ArrayList<Lion> createLions = new ArrayList<>();
        for (int i = 0; i < lionCount; i++) {
            createLions.add(new Lion(10, 10, 10, 10));
        }
        return createLions;
    }
}
