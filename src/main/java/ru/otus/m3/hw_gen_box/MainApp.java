package ru.otus.m3.hw_gen_box;

public class MainApp {
    public static void main(String[] args) {

        BoxGen<Apple> appleBox = new BoxGen<>();
        appleBox.putFruit(new Apple(1));
        appleBox.putFruit(new Apple(2));
        appleBox.putFruit(new Apple(4));

        BoxGen<Orange> orangeBox = new BoxGen<>();
        orangeBox.putFruit(new Orange(6));
        orangeBox.putFruit(new Orange(1));


        BoxGen<Fruit> boxCommon = new BoxGen<>();
        boxCommon.putFruit(new Apple(1));
        boxCommon.putFruit(new Orange(6));

        BoxGen<Fruit> boxCommonEmpty = new BoxGen<>();


        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(boxCommon.getWeight());
        System.out.println(boxCommonEmpty.getWeight());

        System.out.println(appleBox.compare(orangeBox));


        appleBox.putThistoAnother(boxCommonEmpty);

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(boxCommon.getWeight());
        System.out.println(boxCommonEmpty.getWeight());


    }
}

/*
    Создайте классы Fruit, Apple extends Fruit, Orange extends Fruit;
    Создайте класс Box, в который можно складывать фрукты.
    Коробки условно сортируются по типу фрукта:
    Box только для яблок,
    Box только для апельсин,
    Box и для тех, и для других фруктов.
    Для хранения фруктов внутри коробки используйте ArrayList;

    Реализуйте метод добавления фрукта в коробку;
    Реализуйте метод weight, который высчитывает вес коробки (например, из веса одного фрукта и их количества,
    или может через суммирование, как посчитаете нужным). Вес фрукта задаете самостоятельно, единицы измерения не важны;

    Реализуйте метод compare, позволяющий сравнить текущую коробку с переданной в качестве аргумента. true – если их массы равны.
    Можно сравнивать коробки с разными типами фруктов;

    Реализуйте метод, позволяющий пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов в коробках;

 */