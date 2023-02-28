package terminal;

public class CommandParser {
    private String[] strArray;
    private String str;

    public CommandParser() {
    }

    public String[] parseCommand(String str) {
        this.str = str;
        if (check())
            return strArray;
        return null;
    }


    boolean check() {
        strArray = new String[2];
        if (str.contains(" ")) {
            strArray = str.split(" ");
        } else System.out.println("Нет пробела");

        if (strArray.length == 2) return true;
        else if (strArray[0].equals("add") || strArray[0].equals("delete")) return true;
        else if (strArray[1].equals("Wolf") || strArray[1].equals("Snake")) return true;
        return false;
    }

}
