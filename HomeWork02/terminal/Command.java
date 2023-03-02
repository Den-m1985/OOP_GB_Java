package terminal;

import java.util.ArrayList;

public class Command {
    private String action;
    private String animal;
    //private ArrayList<String> parametersAnimal;


    public Command(String action, String animal) {
        this.action = action;
        this.animal = animal;
        //this.parametersAnimal = parametersAnimal;
    }

    public String getAction() {
        return action;
    }

    public String getAnimal() {
        return animal;
    }

//    public ArrayList<String> getParametersAnimal() {
//        return parametersAnimal;
//    }


    // Добавить с статические переменные.
    public boolean isCreateWolf(){
        return action.equals("create");
    }
}
