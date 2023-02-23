package zoo;

import animals.Snake;
import animals.Wolf;
import cage.AnimalCage;

import java.util.ArrayList;


public class Zoo {
    private AnimalCage<Wolf> wolvesInZoo;
    private AnimalCage<Snake> snakesInZoo;


    public Zoo() {
        ArrayList<Zoo> animalInZoo = new ArrayList<>();
    }


    public AnimalCage<Wolf> getWolvesInZoo() {
        return wolvesInZoo;
    }

    public void setWolvesInZoo(AnimalCage<Wolf> wolvesInZoo) {
        this.wolvesInZoo = wolvesInZoo;
    }

    public AnimalCage<Snake> getSnakesInZoo() {
        return snakesInZoo;
    }

    public void setSnakesInZoo(AnimalCage<Snake> snakesInZoo) {
        this.snakesInZoo = snakesInZoo;
    }

    @Override
    public String toString() {
        return "Zoo: " +
                "wolves: " + wolvesInZoo +"\n"+
                ", snakes: " + snakesInZoo +
                "\n";
    }
}
