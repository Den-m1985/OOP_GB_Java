package cage;
import animals.*;

public interface AnimalCage {

    void addAnimal(Animal animal);

    int setFeed(int weightFood);

    int cleanCase();
}
