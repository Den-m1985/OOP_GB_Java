package cage;
import animals.*;
import java.util.ArrayList;
import java.util.Collections;

public interface AnimalCage <T extends Animal> {

    default void sortByAge (ArrayList<T> animalList) {
        //Collections.sort(animalList, new AnimalListComparaor());
    };

    void addAnimal(T animal);

    T takeOfAnimal();

    int setFeed(int weightFood);

    int cleanCase();


}
