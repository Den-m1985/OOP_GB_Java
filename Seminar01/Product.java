import javax.xml.transform.sax.SAXResult;

public class Product {
    private String name;
    private float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String GetName() {
        return name;
    }


    public float GetPrice() {
        return price;
    }

    public void SetName(String name){
        this.name = name;
    }

    public void SetPrice(float price){
        this.price = price;
    }

    public void consume(){
        System.out.println(" продукт потреблен ");
    }

}
