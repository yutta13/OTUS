package ru.otus.hw4;

public class Car implements Transport {
    String name;
    int petrol;

    public Car(int petrol, String name) {
        this.petrol = petrol;
        this.name =name;
    }
    @Override
    public boolean getOn() {
        System.out.println("Сел в машину");
        return true;
    }
    @Override
    public boolean getOff() {
        System.out.println("Покинул машину");
        return true;
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        if ((terrain == Terrain.RAVNINA)) {
            this.petrol -= distance/10;
            if (petrol >= 0) {
                System.out.println("Проехал на " + name + " " + distance + "км, остаток бензина : " + petrol);
                return true;
            }
            petrol = 0;
            System.out.println("упс, бензина  не хватило: " + petrol);
            return false;
        }
        System.out.println("упс,тут не проеду");
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
