import animals.Snake;
import animals.Wolf;
import cage.SnakeTerrarium;
import cage.WolfCage;
import factory.SnakesFactory;
import factory.WolfFactory;
import terminal.TerminalReader;
import zoo.Zoo;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        //Homework2
        ArrayList<Wolf> wolfs = WolfFactory.createWolfs(5);
        WolfCage wolvesInCage = new WolfCage(wolfs);
        //System.out.println(wolvesInCage);
        //System.out.print("Random wolf: ");
        List<Wolf> wolfRandom = new ArrayList<>();
        wolfRandom = wolvesInCage.getRandomAnimal();
        //System.out.println(wolfRandom);
        Wolf pushok = new Wolf(2001, 6, 4, 6);
        wolvesInCage.addAnimal(pushok);
        //System.out.println(wolvesInCage);
        //System.out.println();


        // Homework3
//        wolvesInCage.sortWeight();
//        System.out.println("Sorted list of wolves by weight:");
//        System.out.println();
//        System.out.println(wolvesInCage);
//        System.out.println();
//        wolvesInCage.sortYear();
//        System.out.println("Sorted list of wolves by year:");
//        System.out.println();
//        System.out.println(wolvesInCage);


        // Homework4
        ArrayList<Snake> snakes = SnakesFactory.createSnakes(5);
        SnakeTerrarium snakesInCage = new SnakeTerrarium(snakes);
        System.out.println(snakesInCage);
        //AnimalUtils.sortAnimals(wolfs);
        //AnimalUtils.sortAnimals(snakes);
        //System.out.println(snakes);
        Zoo zoo = new Zoo();
        zoo.setSnakesInZoo(snakesInCage);
        zoo.setWolvesInZoo(wolvesInCage);
        //System.out.println(zoo);


        // Homework5
        TerminalReader terminalReader = new TerminalReader(zoo);
        terminalReader.endLess();


        //System.out.println(wolvesInCage);
        System.out.println(snakesInCage);

    }

}
