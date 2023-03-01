package terminal;

public class PrintMenu {
    public void printMenu(){
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - Добавить животное? тогда введите: add Wolf или add Snake через пробел");
        System.out.println("2 - Удалить животное? введите: delete Wolf или delete Snake через пробел");
        System.out.println("Для выхода нажмите q");
    }

    public void printAnimalParametres(){
        System.out.println("Что бы добавить животное введите цифры через пробел");
        System.out.println("Например: 2000 5 5 5");
    }



}
