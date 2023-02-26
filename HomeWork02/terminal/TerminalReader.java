package terminal;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private CommandParser commandParser;


    public TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }


    public static TerminalReader terminalReader(CommandParser commandParser){
        if (terminalReader == null){
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }


    public static void runReader(){

        String str = "";
        while (true) {
            ScanerConsole scanerConsole = new ScanerConsole();
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 - Добавить животное? \n2 - Удалить животное?\nДля выхода нажмите q");
            str = scanerConsole.endLess();
            if (str.equals("q")) break;
            if (str.equals("1")) new CommandExecutableFactory();
        }


    }


}
