package ru.otus.basic.modul2;

public class Dog extends Animal {
    public Dog(String name, int runspeed,int swimspeed, int stamina){
        this.name = name;
        this.runspeed = runspeed;
        this.swimspeed = swimspeed;
        this.stamina =stamina;
    }

    @Override
    public float swim(int distance){
        float time;
        this.stamina=stamina-distance*2;
        if (stamina>0){
            time = distance/runspeed;
            System.out.println(name + " Затраченное время на плавание, сек: " + time + "; Выносливость = " + stamina);
        }else {
            time=-1;
            System.out.println(name + " Устала. Затраченное время на плавание, сек: " + time);
        }
        return stamina;
    }
}