package ru.otus.basic.modul2;

public class MainBoxClass {
    public static void main(String[] args) {

        Box box1 = new Box(10, 12, 10, "Red", true);
        Box box2 = new Box(6, 7, 14, "Green", false);


//        // Выводим информацию о коробке
        box1.printInfo();
        box2.printInfo();
//
//        //Перекрасим коробку
        box1.setColor("Yellow");
//
//        //Откроем коробку

        box2.toOpen();
//
//        //Закроем коробку
        box1.toClose();

        //Кладем предмет в коробку
        box2.putItem("some1");

        //Убираем предмет из коробки
        box1.deleteItem("some1");
        box1.deleteItem("some2");
        box2.deleteItem("some1");

    }
}
