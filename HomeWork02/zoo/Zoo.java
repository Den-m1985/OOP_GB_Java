package zoo;

import animals.Snake;
import animals.Wolf;
import cage.AnimalCage;


public class Zoo {
    private AnimalCage<Wolf> wolfCage;
    private AnimalCage<Snake> snakeCage;

    public Zoo(AnimalCage<Wolf> wolfCage, AnimalCage<Snake> snakeCage) {
        this.wolfCage = wolfCage;
        this.snakeCage = snakeCage;
    }

    public AnimalCage<Wolf> getWolfCage() {
        return wolfCage;
    }

    public void setWolfCage(AnimalCage<Wolf> wolfCage) {
        this.wolfCage = wolfCage;
    }

    public AnimalCage<Snake> getSnakeCage() {
        return snakeCage;
    }

    public void setSnakeCage(AnimalCage<Snake> snakeCage) {
        this.snakeCage = snakeCage;
    }
}
