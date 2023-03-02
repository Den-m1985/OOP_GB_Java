package terminal;

import zoo.Zoo;

public interface CommandExecutableFactory {

    public CommandExecutable create(Command command, Zoo zoo);
}
