package cage;

import animals.*;

import java.util.List;

public interface AnimalCage {

    void addAnimal(Animal animal);

    void setFeed(int weightFood);

    int cleanCase();

    List getRandomAnimal();
}
