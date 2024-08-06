package ru.otus.basic.modul2;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Blacky", 10, 10);
        Dog dog = new Dog("Yoky", 25,10,100);
        Horse horse = new Horse("Rock", 70,5,1000 );
        System.out.println("Все бегут");
        cat.run(8);
        dog.run(178);
        horse.run(840);

        System.out.println("Состояние");
        cat.info();
        dog.info();
        horse.info();

        System.out.println("Все плывут");
        cat.swim(10);
        dog.swim(50);
        horse.swim(60);

        System.out.println("Состояние");
        cat.info();
        dog.info();
        horse.info();
    }
}


