package terminal.parser;

import terminal.command.Command;

public interface CommandParser {

    public Command parseCommand(String str);

}
