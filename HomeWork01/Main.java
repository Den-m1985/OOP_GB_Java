import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<HotDrink> goods = new ArrayList<>();

        HotDrink teaLipton = new HotDrink("Lipton", 354, 500, 60);
        goods.add(teaLipton);

        HotDrink coffee = new HotDrink("Capuchino", 220, 250, 70);
        goods.add(coffee);

        System.out.println(teaLipton.getInfo());
        System.out.println(coffee.getInfo());


        VendingMachine vendingMachine = new VendingMachine(goods);

    }
}