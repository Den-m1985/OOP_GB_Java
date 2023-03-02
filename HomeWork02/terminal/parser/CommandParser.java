package terminal.parser;

import terminal.Command;

public interface CommandParser {

    public Command parseCommand(String str);



//    boolean check() {
//        strArray = new String[2];
//        if (str.contains(" ")) {
//            strArray = str.split(" ");
//        } else System.out.println("Нет пробела");
//
//        if (strArray.length == 2) return true;
//        else if (strArray[0].equals("add") || strArray[0].equals("delete")) return true;
//        else if (strArray[1].equals("Wolf") || strArray[1].equals("Snake")) return true;
//        return false;
//    }

}
