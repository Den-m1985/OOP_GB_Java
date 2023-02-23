public class Product {
    private String name;
    private float price;


    // конструктор по умолчанию
    public Product() {
        this("default", 0);
    }


    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }


    /**
     * Получение информации
     */
    public String getInfo() {
        return String.format("Name: %s,  Price: %s", this.name, this.price);
    }


    /**
     * Возврат name
     */
    public String getName() {
        return name;
    }


    /**
     * Возврат price
     */
    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
