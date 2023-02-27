package zoo;

import animals.Snake;
import animals.Wolf;
import cage.SnakeTerrarium;
import cage.WolfCage;

import java.util.ArrayList;


public class Zoo {
    private WolfCage wolvesInZoo;
    private SnakeTerrarium snakesInZoo;
    private ArrayList<Zoo> animalInZoo;


    public Zoo() {
        this.animalInZoo = new ArrayList<>();
    }

    public void addSnake() {

    }

    public WolfCage getWolvesInZoo() {
        return wolvesInZoo;
    }


    public void setWolvesInZoo(WolfCage wolvesInZoo) {
        this.wolvesInZoo = wolvesInZoo;
    }


    public SnakeTerrarium getSnakesInZoo() {
        return snakesInZoo;
    }


    public void setSnakesInZoo(SnakeTerrarium snakesInZoo) {
        this.snakesInZoo = snakesInZoo;
    }


    @Override
    public String toString() {
        return "Zoo: " +
                "wolves: " + wolvesInZoo + "\n" +
                ", snakes: " + snakesInZoo +
                "\n";
    }


    public Wolf takeOfWolf() {
        return this.wolvesInZoo.takeOfAnimal();
    }


    public Snake takeOfSnake() {
        return this.snakesInZoo.takeOfAnimal();
    }

}
