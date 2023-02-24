import java.util.ArrayList;

public class VendingMachine <T extends Product> {
    protected ArrayList<T> goods;


    public VendingMachine(ArrayList<T> goods) {
        this.goods = goods;
    }

    public T getProductByName(String name) {
        for (T el : goods) {
            if (el.getName().equals(name)) return el;
        }

        return null;
    }


    @Override
    public String toString() {
        return "VendingMachine{" +
                "goods=" + goods +
                '}';
    }
}
