package terminal.command;

public class Command {
    private String command;

    public static final String ADDWOLF = "addWolf";
    public static final String ADDSNAKE = "addSnake";
    public static final String DELETEWOLF = "deleteWolf";
    public static final String DELETESNAKE = "deleteSnake";


    public Command(String command) {
        this.command = command;
    }


    public boolean isAddWolf() {
        return command.equals(ADDWOLF);
    }

    public boolean isAddSnake() {
        return command.equals(ADDSNAKE);
    }

    public boolean isDeleteWolf() {
        return command.equals(DELETEWOLF);
    }

    public boolean isDeleteSnake() {
        return command.equals(DELETESNAKE);
    }

}
