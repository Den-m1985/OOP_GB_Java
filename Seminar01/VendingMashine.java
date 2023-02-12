import java.util.ArrayList;

public class VendingMashine {
    public ArrayList<Product> goods = new ArrayList<>();


    public VendingMashine(ArrayList<Product> goods){
        this.goods = goods;
    }

    public Product GetProductByName(String  name){
        for (Product el: goods) {
            if(el.GetName().equals(name)) return el;
        }

        return null;
    }



}
