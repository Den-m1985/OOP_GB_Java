package animalUtils;

import animals.Animal;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnimalUtils {

    public static <T extends Animal> List<T> sortAnimals (List<T> animalList){

        Collections.sort(animalList, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                if (o1.getYear() > o2.getYear())
                    return 1;
                else if (o1.getYear() < o2.getYear())
                    return -1;
                else
                    return 0;
            }
        });
        return animalList;
    }


}
