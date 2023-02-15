package animals;

public class Main {
    public static void main(String[] args) {
        Lion lion1 = new Lion(2, 20, 4, 5);
        System.out.println(lion1.getMaxWeight());
        System.out.println(lion1.getWeight());
        lion1.setWeight(101);
        System.out.println(lion1.getWeight());
        lion1.feed(100);
        System.out.println(lion1.getWeight());

    }


}
