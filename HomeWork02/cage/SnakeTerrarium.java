package cage;

import animals.Snake;
import animals.Wolf;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
    public void addAnimal(Snake animal) {snakes.add(animal);
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


    public Snake takeOfAnimal() {
        if(this.snakes.isEmpty()){
            return null;
        }
        else {
            Random random = new Random();
            int i = random.nextInt(snakes.size());
            return (Snake) snakes.remove(i);
        }
    }
}
