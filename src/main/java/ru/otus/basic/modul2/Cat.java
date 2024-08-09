package ru.otus.basic.modul2;

public class Cat extends Animal {
    public Cat(String name, int runSpeed, int stamina) {
        super(name, runSpeed, stamina);
    }

    @Override
    public float swim(int distance) {
        System.out.println(name + " Не умеет плавать");
        return stamina;
    }
}
