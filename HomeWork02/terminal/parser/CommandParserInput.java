package terminal.parser;

import terminal.command.Command;

public class CommandParserInput implements CommandParser {
    private String outString;

    @Override
    public Command parseCommand(String str) {

        String[] strArray = str.split("\\s+");
        outString = strArray[0] + strArray[1];
        return new Command(outString);
    }
}
