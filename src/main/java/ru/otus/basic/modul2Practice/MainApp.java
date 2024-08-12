package ru.otus.basic.modul2Practice;

public class MainApp {
    public static void main(String[] args) {

        Plate plate1 = new Plate(40, 40);
        Plate plate2 = new Plate(30, -30);

        Cat[] cats = new Cat[]{
                new Cat("Tosha", 10),
                new Cat("Patric", 15),
                new Cat("Rocky", 16)
        };

        for (Cat catArray : cats) {
            catArray.letsEat(plate1);
        }
        System.out.println("добавим еды и снова покормим только рокки");
        plate1.addFood(22);
        plate2.addFood(22);
        cats[2].letsEat(plate1);
    }
}
