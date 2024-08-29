package ru.otus.basic.module2.hw4;

public class Hourse implements Transport {
    int power;
    String name;

    public Hourse(int power, String name) {
        this.power = power;
        this.name =name;
    }

    @Override
    public boolean getOn() {
        System.out.println("Сел на лошадь");
        return true;
    }

    @Override
    public boolean getOff() {
        System.out.println("Слез с лошади");
        return true;
    }
    @Override
    public boolean move(int distance, Terrain terrain) {
        if ((terrain != Terrain.BOLOTO)) {
            this.power -= distance/20;
            if (power >= 0) {
                System.out.println("Проехал на лошади " + name + " " + distance + "км, остаток лошадиных сил : " + power);
                return true;
            }
            power = 0;
            System.out.println("упс, сил у лошади закончились и равны " + power);
            return false;
        }
        System.out.println("упс,тут лошадь не пройдет");
        return false;
    }
    @Override
    public String getName() {
        return null;
    }
}