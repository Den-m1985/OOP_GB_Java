import animalUtils.AnimalUtils;
import animals.*;
import factory.*;
import cage.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Lion> lions = LionsFactory.createLions(10);

        LionCage lionsInCage = new LionCage(lions);
        //System.out.println(lionsInCage);

        //Collections.sort(lions);
        //System.out.println(lions);

//        lionsInCage.sortVolume();
//        System.out.println(lionsInCage);

        AnimalUtils.sortAnimals(lions);
        System.out.println(lions);


    }

}
