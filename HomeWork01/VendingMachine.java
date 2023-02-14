import java.util.ArrayList;

public class VendingMachine {
    protected ArrayList<HotDrink> goods = new ArrayList<>();


    public VendingMachine(ArrayList<HotDrink> goods) {
        this.goods = goods;
    }

    public Product GetProductByName(String name) {
        for (Product el : goods) {
            if (el.getName().equals(name)) return el;
        }

        return null;
    }


}
