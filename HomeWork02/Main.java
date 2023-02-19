import animals.Wolf;
import cage.WolfCage;
import factory.WolfFactory;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        //Homework2
        // Создаем волков.
        ArrayList<Wolf> wolfs = WolfFactory.createLions(5);
        // Создаем клетку и помещаем туда волков.
        WolfCage lionsInCage = new WolfCage(wolfs);
        //System.out.println(lionsInCage);
        System.out.print("Random wolf: ");
        // Рандомный волк.
        List<Wolf> wolfRandom = new ArrayList<>();
        wolfRandom = lionsInCage.getRandomAnimal();
        System.out.println(wolfRandom);
        // Добавляем в клетку волка.
        Wolf pushok = new Wolf(2001, 6, 4, 6);
        lionsInCage.addAnimal(pushok);
        System.out.println(lionsInCage);
        System.out.println();


        // Homework3
        // Сортируем волков по весу
        lionsInCage.sortWeight();
        System.out.println("Sorted list of wolves by weight:");
        System.out.println();
        System.out.println(lionsInCage);
        System.out.println();

        // Сортируем волков по году
        lionsInCage.sortYear();
        System.out.println("Sorted list of wolves by year:");
        System.out.println();
        System.out.println(lionsInCage);

    }

}
