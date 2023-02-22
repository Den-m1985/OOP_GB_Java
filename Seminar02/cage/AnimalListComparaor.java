package cage;

import animals.Animal;
import animals.Lion;

import java.util.Comparator;

public class AnimalListComparaor implements Comparator<Lion> {

    @Override
    public int compare(Lion o1, Lion o2) {
        return Integer.compare(o1.getYear(), o2.getYear());
    }

}
