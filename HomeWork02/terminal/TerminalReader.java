package terminal;

import terminal.command.*;
import terminal.parser.CommandParser;
import zoo.Zoo;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private CommandParser commandParser;  // Зависимость
    private CommandExecutable commandExecutable;
    private final Zoo zoo;
    private Command command;


    public TerminalReader(Zoo zoo) {
        this.zoo = zoo;
    }


    private TerminalReader(CommandParser commandParser, Zoo zoo) {
        this.commandParser = commandParser;
        this.zoo = zoo;
    }

    // SingleTon
    public static TerminalReader terminalReader(CommandParser commandParser, Zoo zoo) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser, zoo);
        }
        return terminalReader;
    }


    public void setCommandExecutable(Command command) {
        this.commandExecutable = new LoginCommandExecutableFactory(zoo).create(command);
    }


    public void endLess() {

        PrintMenu printMenu = new PrintMenu();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            printMenu.printMenu();
            String str = scanner.nextLine();
            if (str.equals(PrintMenu.Q)) break;
            CheckInput checkInput = new CheckInput(str);
            if (checkInput.check()) {
                command = this.commandParser.parseCommand(str);
                setCommandExecutable(command);
                commandExecutable.execute();
            }
        }
        scanner.close();
    }

}
