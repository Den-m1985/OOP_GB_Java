package zoo;

import animals.Lion;
import animals.Snake;
import cage.AnimalCage;

public class Zoo {
    private AnimalCage<Lion> lionCage;
    //private AnimalCage(Snake) snakeCage;


    public Zoo(AnimalCage<Lion> lionCage) {
        this.lionCage = lionCage;
    }

    public Lion takeOfLion() {
        return this.lionCage.takeOfAnimal();
    }


    public AnimalCage<Lion> getLionCage() {
        return lionCage;
    }

    public void setLionCage(AnimalCage<Lion> lionCage) {
        this.lionCage = lionCage;
    }


}
