package animals;

import java.util.Comparator;

public class WolfComparator implements Comparator<Wolf> {


    @Override
    public int compare(Wolf wolf1, Wolf wolf2) {

        int result;
        if((result = Integer.compare(wolf1.year, wolf2.year)) == 0 )
                result = Integer.compare(wolf1.weight, wolf2.weight);
        return result;


        //return Integer.compare(wolf1.weight, wolf2.weight);

    }


}
