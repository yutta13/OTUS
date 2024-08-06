package ru.otus.basic.modul2;

public class Cat extends Animal {
    public Cat(String name, int runspeed, int stamina){
        this.name = name;
        this.runspeed = runspeed;
        this.stamina =stamina;
    }
    @Override
    public float swim(int distance){
        System.out.println(name + " Не умеет плавать" );
        return stamina;
    }
}
