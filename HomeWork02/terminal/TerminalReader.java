package terminal;

import zoo.Zoo;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private Zoo zoo;

    public TerminalReader(Zoo zoo) {
        this.zoo = zoo;
    }

// SingleTon
//    public static TerminalReader terminalReader(CommandParser commandParser) {
//        if (terminalReader == null) {
//            terminalReader = new TerminalReader(commandParser);
//        }
//        return terminalReader;
//    }


    public void endLess() {

        CommandExecutableFactory coExFactory = new CommandExecutableFactory(zoo);
        Scanner scanner = new Scanner(System.in);
        CommandParser commandParser = new CommandParser();

        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 - Добавить животное? тогда введите: add Wolf или add Snake через пробел \n" +
                    "2 - Удалить животное? введите: delete Wolf или delete Snake через пробел\nДля выхода нажмите q");

            String str = scanner.nextLine();
            if (str.equals("q")) break;
            String [] strings = commandParser.parseCommand(str);
            coExFactory.create(strings);
            break;
        }
        scanner.close();
    }


}
