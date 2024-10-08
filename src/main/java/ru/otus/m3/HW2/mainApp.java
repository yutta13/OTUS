package ru.otus.m3.HW2;


public class mainApp {
    public static void main(String[] args) throws InterruptedException {
        int length = 100000000;
        int treadNumber = 5;
        Double[] array = new Double[length];

        //simpleFillArray(array);
        threadFillArray(array, treadNumber);


    }

    //общий метод для формулы
    public static void fillarray(Double[] array, int start, int end) {
        for (int i = start; i < end + 1; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }

    public static void simpleFillArray(Double[] array) {
        long time = System.currentTimeMillis();
        fillarray(array, 0, array.length - 1);
        System.out.println(System.currentTimeMillis() - time);
    }

    public static void threadFillArray(Double[] array, int treadNumber) throws InterruptedException {
        long time = System.currentTimeMillis();
        int step = array.length / treadNumber;
        Thread t1 = new Thread();
        for (int i = 0; i < treadNumber; i++) {
            final int start = step * i;
            final int end = step * i + step - 1;
            t1 = new Thread(() -> {
                fillarray(array, start, end);
            });
            t1.start();

        }
        t1.join();
        System.out.println(System.currentTimeMillis() - time);

    }
}


/*
Необходимо выполнить две реализации задачи заполнения массива
Реализация №1

Реализуйте метод, который создает double массив длиной 100_000_000 элементов
Метод должен должен циклом for пройти по каждому элементу и посчитать его значение по формуле:
array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
Засеките время выполнения цикла и выведите его в консоль.
Реализация №2:

Сделайте то же самое что и в реализации один, только чтобы массив заполняли 4 потока одновременно.
 То есть первый поток заполняет первую четверть массива, второй - вторую и т.д.
 И посмотрите насколько быстрее выполнится работа по сравнению с одним потоком.
* */