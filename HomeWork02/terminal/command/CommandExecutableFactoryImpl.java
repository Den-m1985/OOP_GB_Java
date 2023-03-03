package terminal.command;

import terminal.execute.AddSnakeExecutable;
import terminal.execute.AddWolfExecutable;
import terminal.execute.DeleteSnakeExecutable;
import terminal.execute.DeleteWolfExecutable;
import zoo.Zoo;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory {
    private Zoo zoo;


    public CommandExecutableFactoryImpl(Zoo zoo) {
        this.zoo = zoo;
    }

    public CommandExecutable create(Command command) {


        if (command.isAddWolf()) {
            System.out.println("add Wolf");
            return new AddWolfExecutable(zoo);

        } else if (command.isAddSnake()) {
            System.out.println("add Snake");
            return new AddSnakeExecutable(zoo);

        } else if (command.isDeleteWolf()) {
            System.out.println("delete Wolf success");
            return new DeleteWolfExecutable(zoo);

        } else if (command.isDeleteSnake()) {
            System.out.println("delete Snake success");
            return new DeleteSnakeExecutable(zoo);
        }
        return null;
    }

}
