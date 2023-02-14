import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine extends VendingMachine {

    public HotDrinkVendingMachine(ArrayList<HotDrink> goods) {
        super(goods);
    }


    public List<HotDrink> getProduct(String name) {
        List<HotDrink> findSearch = new ArrayList<>();
        for (HotDrink product : goods) {
            if
            (product.getName().contains(name)) {
                findSearch.add(product);
                System.out.println(product.getInfo());
            }
        }
        return findSearch;
    }


}
