package terminal;

import zoo.Zoo;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private CommandParser commandParser;
    private Zoo zoo;
    private Command command;


    public TerminalReader(Zoo zoo) {
        this.zoo = zoo;
    }


    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    // SingleTon
    public static TerminalReader terminalReader(CommandParser commandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }


    public void endLess() {

        CommandExecutableFactory coExFactory = new CommandExecutableFactory(zoo);
        PrintMenu printMenu = new PrintMenu();
        Scanner scanner = new Scanner(System.in);
        //CommandParser commandParser = new CommandParser();

        while (true) {

            printMenu.printMenu();

            String str = scanner.nextLine();
            if (str.equals("q")) break;
            Command newCom = this.commandParser.parseCommand(str);

            //String [] strings = commandParser.parseCommand(str);
            //coExFactory.create(strings);
            break;
        }
        scanner.close();
    }


}
