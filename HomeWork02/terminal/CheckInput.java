package terminal;

public class CheckInput {
    private String str;

    public CheckInput(String str) {
        this.str = str;
    }

    boolean check() {
        String[] strArray;

        if (str.contains(" ")) {
            strArray = this.str.split("\\s+");
        } else return false;

        if (strArray.length == 2) {
            if (strArray[0].equals("add") || strArray[0].equals("delete")) return true;
            else if (strArray[1].equals("Wolf") || strArray[1].equals("Snake")) return true;
            return false;
        }
        return false;
    }

}
