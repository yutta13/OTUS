package ru.otus.basic.modul2;

public class Horse extends Animal {
    public Horse(String name, int runSpeed, int swimSpeed, int stamina) {
        super(name, runSpeed, stamina);
        this.swimSpeed = swimSpeed;
        n = 4; //коэф. выносливости в плавании
    }
}