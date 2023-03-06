package terminal;

public class CheckInput {


    public static boolean check(String str) {
        String[] strArray;

        if (str.contains(" ")) {
            strArray = str.split("\\s+");
        } else return false;

        if (strArray.length == 2) {
            return strArray[0].equals("add") || strArray[0].equals("delete") || strArray[1].equals("Wolf") || strArray[1].equals("Snake");
        }
        return false;
    }

}
