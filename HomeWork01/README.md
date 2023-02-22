Создать наследника реализованного класса HotDrink
с дополнительным полем int температура

Создать класс HotDrinkVendingMachine наследника VendingMachine
и реализовать перегруженный метод getProduct(String name,
double volume, double temperature), выдающий продукт
соответствующего имени, объема и температуры. 
Используйте при итерации конструкцию 
if
(product instance of HotDrink){ HotDrink ht = (HotDrink) product; }

В main проинициализировать несколько экземпляров HotDrink
и один HotDrinkVendingMachine и воспроизвести логику заложенную в программе
Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре


Комментарии от преподавателя.
- отсутсвуют модификаторы у конструкторов продуктов . 
- То есть для классов в других папках и проектах создание оъектов будет невозможно((
+ public List<HotDrink> getProduct(String name)
  мне понравилось как вы реализовали метод.
- public Product GetProductByName(String name)
  переменные в джаве принято писать в стиле "camalCase"



Homework 4
Переписать классы из ДЗ1 с использование дженериков