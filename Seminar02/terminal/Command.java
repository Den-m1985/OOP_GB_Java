package terminal;


import java.util.List;

public class Command implements CommandParser {
    private List<String> inputCommand;



    public Command(List<String> inputCommand) {
        this.inputCommand = inputCommand;
    }


    @Override
    public String[] parseCommand(String inputCommand) {
        return new String[0];
    }


}
