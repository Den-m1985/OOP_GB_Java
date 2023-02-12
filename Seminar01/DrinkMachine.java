import java.util.ArrayList;

public class DrinkMachine extends VendingMashine {

    private ArrayList<Drink> drinkArrayList;


    DrinkMachine(ArrayList<Product> goods){
        super(goods);
        drinkArrayList = new ArrayList<Drink>();
    }


    public void AddDrink(Drink drink){
        drinkArrayList.add(drink);
    }

    public Drink GetDrinkByName(String  name){
        for (Drink el: drinkArrayList) {
            if(el.GetName().equals(name)) return el;
        }

        return null;
    }

}
