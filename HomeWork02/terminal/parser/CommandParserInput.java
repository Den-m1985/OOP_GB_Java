package terminal.parser;

import terminal.command.Command;

public class CommandParserInput implements CommandParser {

    @Override
    public Command parseCommand(String str) {

        String[] strArray = str.split("\\s+");
        String outString = strArray[0] + strArray[1];
        return new Command(outString);
    }
}
