package terminal.execute;

import terminal.command.CommandExecutable;
import zoo.Zoo;

public class AddWolfExecutable implements CommandExecutable {
    private Zoo zoo;


    public AddWolfExecutable(Zoo zoo) {
        this.zoo = zoo;
    }


    @Override
    public void execute() {
        this.zoo.addWolf();
    }

}
