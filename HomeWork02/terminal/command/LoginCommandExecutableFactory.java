package terminal.command;

import zoo.Zoo;

public class LoginCommandExecutableFactory extends CommandExecutableFactoryImpl {
private Zoo zoo;

    public LoginCommandExecutableFactory(Zoo zoo) {
        super(zoo);
    }


    @Override
    public CommandExecutable create(Command command) {
        System.out.println("Start log");
        CommandExecutable com = super.create(command);
        System.out.println("End log");
        return com;
    }
}
