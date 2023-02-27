package terminal;

import animals.Snake;
import animals.Wolf;
import cage.SnakeTerrarium;
import cage.WolfCage;
import zoo.Zoo;

public class CommandExecutableFactory {
    private Zoo zoo;
    private WolfCage wolfCage;
    private SnakeTerrarium snakeTerrarium;


    public CommandExecutableFactory(Zoo zoo) {
        this.zoo = zoo;
    }

    public CommandExecutable create (String[] input){



        String code = input[0] + input[1];

        switch (code) {
            case "addWolf" -> {
                zoo.
                wolfCage.addAnimal(new Wolf(2000,5,4,5));
                System.out.println("add Wolf");
            }
            case "addSnake" -> {
                snakeTerrarium.addAnimal(new Snake(2000,5,0,20));
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
