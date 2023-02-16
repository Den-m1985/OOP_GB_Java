package animals;

public abstract class Animal {
    protected int year;
    protected int weight;
    protected int countLimbs;


    public Animal(int year, int weight, int countLimbs) {
        this.year = year;
        this.weight = weight;
        this.countLimbs = countLimbs;
    }


    public abstract int getMaxWeight();


    public void feed(int foodWeight) {
        if ((this.weight + foodWeight) <= getMaxWeight()) {
            this.weight = +foodWeight;
        } else System.out.println("Max weight is exceeded");
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCountLimbs() {
        return countLimbs;
    }

    public void setCountLimbs(int countLimbs) {
        this.countLimbs = countLimbs;
    }

    public abstract String getType();

}
