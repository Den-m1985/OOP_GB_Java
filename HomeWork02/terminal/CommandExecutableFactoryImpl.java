package terminal;

import cage.SnakeTerrarium;
import cage.WolfCage;
import zoo.Zoo;

import java.util.ArrayList;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory {
    private Zoo zoo;
    private WolfCage wolfCage;
    private SnakeTerrarium snakeTerrarium;
    private Command command;


    public CommandExecutableFactoryImpl() {

    }

    public CommandExecutable create(Command command, Zoo zoo) {


// перенести в Command
// в нем вызываем методы true/false
        String code = command.getAction() + command.getAnimal();
        //ArrayList<String > parameters = command.getParametersAnimal();


        switch (code) {
            case "addWolf" -> {
                command.isCreateWolf();   // ?????????
                zoo.addWolf();
                System.out.println("add Wolf");
            }
            case "addSnake" -> {
                zoo.addSnake();
                System.out.println("add Snake");
            }
            case "deleteWolf" -> {
                DeleteWolfExecutable deleteWolf = new DeleteWolfExecutable(zoo);
                deleteWolf.execute();
                System.out.println("delete Wolf success");
            }
            case "deleteSnake" -> {
                DeleteSnakeExecutable deleteSnake = new DeleteSnakeExecutable(zoo);
                deleteSnake.execute();
                System.out.println("delete Snake success");
            }
        }
        return null;
    }



}
