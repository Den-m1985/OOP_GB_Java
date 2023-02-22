import animalUtils.AnimalUtils;
import animals.Wolf;
import cage.WolfCage;
import factory.WolfFactory;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        //Homework2
        ArrayList<Wolf> wolfs = WolfFactory.createWolfs(5);
        WolfCage lionsInCage = new WolfCage(wolfs);
        //System.out.println(lionsInCage);
        //System.out.print("Random wolf: ");
        List<Wolf> wolfRandom = new ArrayList<>();
        wolfRandom = lionsInCage.getRandomAnimal();
       //System.out.println(wolfRandom);
        Wolf pushok = new Wolf(2001, 6, 4, 6);
        lionsInCage.addAnimal(pushok);
//        System.out.println(lionsInCage);
//        System.out.println();


        // Homework3
//        lionsInCage.sortWeight();
//        System.out.println("Sorted list of wolves by weight:");
//        System.out.println();
//        System.out.println(lionsInCage);
//        System.out.println();
//
//        lionsInCage.sortYear();
//        System.out.println("Sorted list of wolves by year:");
//        System.out.println();
//        System.out.println(lionsInCage);


        // Homework4
        AnimalUtils.sortAnimals(wolfs);
        System.out.println(wolfs);

    }

}
