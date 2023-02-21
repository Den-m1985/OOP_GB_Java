package cage;
import animals.*;

public interface AnimalCage <T> {


    void addAnimal(<T> animal);

    int setFeed(int weightFood);

    int cleanCase();
}
