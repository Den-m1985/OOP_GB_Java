public class HotDrink extends Drink {
    private float temperate;


    HotDrink(String name, float price, int volume, float temperate) {
        super(name, price, volume);
        this.temperate = temperate;
    }


    /**
     * Получение информации
     */
    public String getInfo() {
        return String.format("Name: %s,  Price: %s,  Volume: %s,  Temperate: %s",
                getName(), getPrice(), getVolume(), this.temperate);
    }


    /**
     * Возврат temperate
     */
    public float getTemperate() {
        return temperate;
    }

    @Override
    public String toString() {
        return "HotDrinks: " +
                "info= " + getInfo() + "\n";
    }
}
