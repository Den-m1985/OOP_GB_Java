package terminal.execute;

import terminal.command.CommandExecutable;
import zoo.Zoo;

public class AddSnakeExecutable implements CommandExecutable {
    private Zoo zoo;


    public AddSnakeExecutable(Zoo zoo) {
        this.zoo = zoo;
    }


    @Override
    public void execute() {
        this.zoo.addSnake();
    }

}
