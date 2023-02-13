import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {
        Product a = new Product("Sneekers", 235);
        Product b = new Product("Mars", 46);
        ArrayList<Product> goods = new ArrayList<>();
        goods.add(a);
        goods.add(b);
        for (Product x: goods) {
            System.out.println(x.GetName());
            x.consume();
        }


        VendingMashine mashine = new VendingMashine(goods);
        for (Product x:mashine.goods) {
            System.out.println(x.GetPrice());
            x.consume();
        }

        Drink drink1 = new Drink("Pepsi", 356);
        Drink drink2 = new Drink("Coca-Colla", 35625);
        drink2.consume();

    }
}
