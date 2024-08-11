package ru.otus.basic.modul2;

public class Dog extends Animal {
    public Dog(String name, int runSpeed, int swimSpeed, int stamina) {
        super(name, runSpeed, stamina);
        this.swimSpeed = swimSpeed;
        n = 2; //коэф. выносливости в плавании
    }
}