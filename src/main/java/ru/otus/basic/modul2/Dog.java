package ru.otus.basic.modul2;

public class Dog extends Animal {
    public Dog(String name, int runSpeed, int swimSpeed, int stamina) {
        super(name, runSpeed, stamina);
        this.swimSpeed = swimSpeed;
    }

    @Override
    public float swim(int distance) {
        float time;
        int n = 2;  //коэффициент выносливости
        this.stamina = stamina - distance * n;
        if (stamina > 0) {
            time = distance / runSpeed;
            System.out.println(name + " Затраченное время на плавание, сек: " + time + "; Выносливость = " + stamina);
        } else {
            time = -1;
            System.out.println(name + " Устала. Затраченное время на плавание, сек: " + time);
        }
        return stamina;
    }

}