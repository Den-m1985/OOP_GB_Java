import animals.Wolf;
import cage.WolfCage;
import factory.WolfFactory;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Wolf> wolfs = WolfFactory.createLions(5);

        WolfCage lionsInCage = new WolfCage(wolfs);
        System.out.println(lionsInCage);

        System.out.print("Random wolf: ");
        lionsInCage.getRandomAnimal();

        Wolf pushok = new Wolf(1, 6, 20, 6);
        lionsInCage.addAnimal(pushok);
        System.out.println(lionsInCage);

    }

}
