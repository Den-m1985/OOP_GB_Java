package terminal.parser;

import terminal.Command;

public class CommandParserInput implements CommandParser {

    @Override
    public Command parseCommand(String str) {
        String[] strArray = str.split(" ");

        return new Command(strArray[0], strArray[1]);
    }
}
