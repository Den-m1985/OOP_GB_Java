import animals.Wolf;
import cage.WolfCage;
import factory.WolfFactory;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Wolf> wolfs = WolfFactory.createLions(5);

        WolfCage lionsInCage = new WolfCage(wolfs);
        System.out.println(lionsInCage);

    }
}
