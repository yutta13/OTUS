package ru.otus.basic.modul2;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Blacky", 10, 10);
        Dog dog = new Dog("Yoky", 25, 20, 600);
        Horse horse = new Horse("Rock", 70, 5, 1300);
        System.out.println("\nВсе бегут");
        cat.run(8);
        dog.run(510);
        horse.run(1000);

        System.out.println("\nСостояние");
        cat.info();
        dog.info();
        horse.info();

        System.out.println("\nВсе плывут");
        cat.swim(10);
        dog.swim(50);
        horse.swim(60);

        System.out.println("\nСостояние");
        cat.info();
        dog.info();
        horse.info();
    }
}


