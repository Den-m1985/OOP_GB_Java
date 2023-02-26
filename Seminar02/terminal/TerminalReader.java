package terminal;

import java.awt.event.WindowListener;
import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private CommandParser commandParser;


    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }


    public static TerminalReader terminalReader(CommandParser commandParser){
        if (terminalReader == null){
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    void endLess() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String str = scanner.nextLine();
            if (str.equals("q")) break;
        }
        scanner.close();
    }




}
