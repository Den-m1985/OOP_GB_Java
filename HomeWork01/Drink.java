public class Drink extends Product {
    private int volume;


    Drink(String name, float price, int volume) {
        super(name, price);
        this.volume = volume;
    }


    /**
     * Возврат volume
     */
    public int getVolume() {
        return volume;
    }


}
