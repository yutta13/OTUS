package ru.otus.m3.hwGenBox;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        BoxGen<Apple> appleBox = new BoxGen<>();
        appleBox.putFruit(new Apple(1));
        appleBox.putFruit(new Apple(2));
        appleBox.putFruit(new Apple(4));

        BoxGen<Apple> appleBox2 = new BoxGen<>();
        appleBox2.putFruit(new Apple(3));
        appleBox2.putFruit(new Apple(3));

        BoxGen<Orange> orangeBox = new BoxGen<>();
        orangeBox.putFruit(new Orange(6));
        orangeBox.putFruit(new Orange(1));


        BoxGen<Fruit> boxCommon = new BoxGen<>();
        boxCommon.putFruit(new Apple(1));
        boxCommon.putFruit(new Orange(6));

        BoxGen<Fruit> boxCommonEmpty = new BoxGen<>();


        System.out.println(appleBox.getWeight());
        System.out.println(appleBox2.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(boxCommon.getWeight());
        System.out.println(boxCommonEmpty.getWeight());

        System.out.println(appleBox.compare(orangeBox));

        appleBox.moveFruitsToBox(appleBox2 );


        System.out.println(appleBox.getWeight());
        System.out.println(appleBox2.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(boxCommon.getWeight());
        System.out.println(boxCommonEmpty.getWeight());


    }
}
