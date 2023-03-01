package terminal;

import zoo.Zoo;

public class LogingCommandExecutableFactory extends CommandExecutableFactory {


    public LogingCommandExecutableFactory(Zoo zoo) {
        super(zoo);
    }


    @Override
    public CommandExecutable create(Command command) {
        System.out.println("Start");
        CommandExecutable com = super.create(command);
        System.out.println("End");
        return com;
    }
}
