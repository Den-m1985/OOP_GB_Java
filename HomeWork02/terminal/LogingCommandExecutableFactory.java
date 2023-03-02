package terminal;

import zoo.Zoo;

public class LogingCommandExecutableFactory extends CommandExecutableFactoryImpl {
private Zoo zoo;

    public LogingCommandExecutableFactory(Zoo zoo) {
        super(zoo);
    }


    @Override
    public CommandExecutable create(Command command, Zoo zoo) {
        System.out.println("Start");
        CommandExecutable com = super.create(command, zoo);
        System.out.println("End");
        return com;
    }
}
