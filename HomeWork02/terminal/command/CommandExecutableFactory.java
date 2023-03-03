package terminal.command;

import zoo.Zoo;

public interface CommandExecutableFactory {

    CommandExecutable create(Command command);
}
