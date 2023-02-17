import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Task01 {
    private  static List<Integer> integerList = Arrays.asList(2,6,5,9,5,2);
    public static void main(String[] args) {

        TreeSet z = new TreeSet<>();
        z.addAll(integerList);
        System.out.println(z);

    }
}
