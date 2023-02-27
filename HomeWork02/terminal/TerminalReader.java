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

        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 - Добавить животное? тогда введите: add Wolf через пробел \n" +
                    "2 - Удалить животное? введите: delete Wolf через пробел\nДля выхода нажмите q");

            String str = scanner.nextLine();
            if (str.equals("q")) break;
            CommandParser commandParser = new CommandParser(str);
            String [] strings = commandParser.parseCommand();
            coExFactory.create(strings);
            break;
        }
        scanner.close();
    }


}
