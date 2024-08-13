package ru.otus.basic.module2.hw4;

public class Bike implements Transport {
    String name;

    public Bike(String name) {
        this.name = name;
    }

    @Override
    public boolean getOn() {
        System.out.println("Сел на велосипед");
        return true;
    }

    @Override
    public boolean getOff() {
        System.out.println("Слез с велосипеда");
        return true;
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        if ((terrain != Terrain.BOLOTO)) {
            System.out.println("Проехал на велосипеде " + name + " " + distance + "км");
            return true;
        }
        System.out.println("упс,тут не проеду");
        return false;

    }

    @Override
    public String getName() {
        return name;
    }
}
