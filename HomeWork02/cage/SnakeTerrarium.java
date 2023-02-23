package cage;

import animals.Snake;

import java.util.ArrayList;
import java.util.List;

public class SnakeTerrarium implements AnimalCage<Snake> {
    private int cleanCage;

    private ArrayList<Snake> snakes;


    @Override
    public String toString() {
        return "SnakeTerrarium: " +
                "cleanTerrarium=" + cleanCage +
                ", snakes:\n" + snakes;
    }

    public SnakeTerrarium(ArrayList<Snake> snakes) {
        this.snakes = snakes;
    }


    @Override
    public void addAnimal(Snake animal) {
    }


    @Override
    public void setFeed(int weightFood) {
    }


    @Override
    public int cleanCase() {
        return 0;
    }


    @Override
    public List getRandomAnimal() {
        return null;
    }
}
