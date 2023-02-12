public class Drink extends Product {
    private int volume;

    Drink(String name, int price){
        super(name, price);
    }

    public void SetVolume(int volume){
        this.volume = volume;
    }
}
