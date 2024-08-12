package ru.otus.basic.modul2Practice;

public class Cat {
    String name;
    int appetit;
    boolean satiety;

    public Cat(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
    }
    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
    public boolean getSatiety() {
        return satiety;
    }
    public void letsEat(Plate plate) {
        if (plate.decreaseFood(appetit)) {
            setSatiety(true);
            System.out.println(name + "'s satiety now is : " + getSatiety());
            System.out.println();
        } else {
            System.out.println(name + "'s satiety now is : " + getSatiety());
        }
    }
}

