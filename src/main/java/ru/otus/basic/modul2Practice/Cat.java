package ru.otus.basic.modul2Practice;

public class Cat {
    String name;
    int appetit;

    public Cat(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
    }

    //Если коту удалось покушать (хватило еды), сытость = true
    public boolean isSatiety(boolean isSatiety) {
        return isSatiety;
    }

    public void letsEat(Plate plate) {
            if (plate.decreaseFood(appetit)) {
                System.out.println(name + "'s satiety now is : " + isSatiety(true));
                System.out.println();
            } else {
                System.out.println(name + "'s satiety now is : " + isSatiety(false));
            }
        }
    }

