package ru.otus.basic.modul2;

public class Animal {
    String name;
    float runSpeed;
    float swimSpeed;
    int stamina;

    public Animal(String name, int runspeed, int stamina) {
        this.name = name;
        this.runSpeed = runspeed;
        this.stamina = stamina;
    }

    public float run(int distance) {
        float time;
        int n = 1; //коэффициент выносливости
        this.stamina = stamina - distance * n;
        if (stamina > 0) {
            time = distance / runSpeed;
            System.out.println(name + " Затраченное время на бег, сек: " + time);
        } else {
            time = -1;
            System.out.println(name + " Устала." + " Затраченное время на бег, сек: " + time);
        }
        return stamina;
    }

    public float swim(int distance) {
        float time;
        int n = 1; //коэффициент выносливости
        this.stamina = stamina - distance * n;
        if (stamina > 0) {
            time = distance / runSpeed;
        } else {
            time = -1;
            System.out.println(name + " Устала");
        }
        System.out.println(name + " Затраченное время на плавание, сек: " + time);
        return stamina;
    }

    public void info() {
        System.out.println("Оставшаяся выносливость в единицах у " + name + " составляет: " + stamina);

    }
}


//    Затраты выносливости:
//        Все животные на 1 метр бега тратят 1 ед выносливости,
//        Собаки на 1 метр плавания - 2 ед.
//        Лошади на 1 метр плавания тратят 4 единицы
//        Кот плавать не умеет.
//        Реализуйте методы run(int distance) и swim(int distance), которые должны возвращать время, затраченное
//        на указанное действие, и “понижать выносливость” животного. Если выносливости не хватает, то возвращаем
//        время -1 и указываем что у животного появилось состояние усталости. При выполнении действий пишем сообщения
//        в консоль.
//        Добавляем метод info(), который выводит в консоль состояние животного.