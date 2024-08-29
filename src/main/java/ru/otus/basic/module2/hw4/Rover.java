package ru.otus.basic.module2.hw4;

public class Rover implements Transport {
    String name ;
    int petrol;
    public Rover(int petrol, String name) {
        this.petrol = petrol;
        this.name =name;
    }

    @Override
    public boolean getOn() {
        System.out.println("Сел в вездеход");
        return true;
    }

    @Override
    public boolean getOff() {
        System.out.println("Покинул вездеход");
        return true;
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        this.petrol -= distance / 8;
        if (petrol >= 0) {
            System.out.println("Проехал на вездеходе " + name + " " + distance + "км, остаток бензина : " + petrol);
            return true;
        }
        petrol = 0;
        System.out.println("упс, бензина  не хватило: " + petrol);
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
