package cage;

import animals.Snake;
import java.util.List;

public class SnakeCage implements AnimalCage<Snake> {

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
