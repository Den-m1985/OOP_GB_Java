package terminal;

public class PrintMenu {

    public static final String Q = "q";


    public void printMenu(){
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - Добавить животное? тогда введите: add Wolf или add Snake через пробел");
        System.out.println("2 - Удалить животное? введите: delete Wolf или delete Snake через пробел");
        System.out.println("Для выхода нажмите " + Q);

    }

}
