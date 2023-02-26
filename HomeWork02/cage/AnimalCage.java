package cage;

import animals.*;

import java.util.List;

public interface AnimalCage <T extends Animal> {

    void addAnimal(T animal);

    void setFeed(int weightFood);

    int cleanCase();

    List getRandomAnimal();

    T takeOfAnimal();
}
