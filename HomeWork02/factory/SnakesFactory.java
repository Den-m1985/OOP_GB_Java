package factory;

import animals.Snake;
import java.util.ArrayList;
import java.util.Random;

public class SnakesFactory {

    /**
     * Create snakes.
     */
    public static ArrayList<Snake> createSnakes(int snakeCount) {
        Random random = new Random();
        ArrayList<Snake> createSnakes = new ArrayList<>();

        for (int i = 0; i < snakeCount; i++) {
            int rand1 = random.nextInt(2000, 2023);  // год
            int rand2 = random.nextInt(1, 50);   // вес

            int rand4 = random.nextInt(1, 50);  // длина тела
            createSnakes.add(new Snake(rand1, rand2, 0, rand4));
        }
        return createSnakes;
    }
}
