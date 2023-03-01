package terminal;

import java.util.ArrayList;
import java.util.List;

public class Command {
    private String action;
    private String animal;
    private ArrayList<String> parametersAnimal;


    public Command(String action, String animal, ArrayList<String> parametersAnimal) {
        this.action = action;
        this.animal = animal;
        this.parametersAnimal = parametersAnimal;
    }

    public String getAction() {
        return action;
    }

    public String getAnimal() {
        return animal;
    }

    public ArrayList<String> getParametersAnimal() {
        return parametersAnimal;
    }

    public void printMenu(){
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - Добавить животное? тогда введите: add Wolf или add Snake через пробел \n" +
                "2 - Удалить животное? введите: delete Wolf или delete Snake через пробел\nДля выхода нажмите q");
    }


    // Добавить с статические переменные.
    public boolean isCreateWolf(){
        return action.equals("create");
    }
}
