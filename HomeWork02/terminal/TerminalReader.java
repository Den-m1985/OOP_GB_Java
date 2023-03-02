package terminal;

import terminal.parser.CommandParser;
import zoo.Zoo;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private CommandParser commandParser;  // Зависимость
    private CommandExecutableFactory commandExecutableFactory;  // Зависимость
    private final Zoo zoo;
    private Command command;  // ??????


    public TerminalReader(Zoo zoo) {
        this.zoo = zoo;
    }


    private TerminalReader(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory, Zoo zoo) {
        this.commandParser = commandParser;
        this.commandExecutableFactory = commandExecutableFactory;
        this.zoo = zoo;
    }

    // SingleTon
    public static TerminalReader terminalReader(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory, Zoo zoo) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser, commandExecutableFactory, zoo);
        }
        return terminalReader;
    }


    public void endLess() {


        PrintMenu printMenu = new PrintMenu();
        Scanner scanner = new Scanner(System.in);


        while (true) {

            printMenu.printMenu();

            String str = scanner.nextLine();
            if (str.equals("q")) break;
            Command newCommand = this.commandParser.parseCommand(str);

            CommandExecutable commandExecutable = this.commandExecutableFactory.create(newCommand, zoo);
            commandExecutable.execute();


            //String [] strings = commandParser.parseCommand(str);
            //commandExecutableFactory.create(strings);
            break;
        }
        scanner.close();
    }


}
