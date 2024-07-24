package ru.otus.basic.lesson1;

import java.util.Random;
import java.util.Scanner;


public class HomeWork1 {

    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        do {
            System.out.println("Введите число от 1 до 5");
            n = scanner.nextInt();

            if (n == 1) {
                greetings();
                return;
            } else if (n == 2) {
                int a = (int)(Math.random()*1000-500);
                int b = (int)(Math.random()*1000-500);
                int c = (int)(Math.random()*1000-500);
                checkSign(a, b, c);
                return;
            } else if (n == 3) {
                selectColor();
                return;
            } else if (n == 4) {
                compareNumbers();
                return;
            } else if (n == 5) {
                int a = (int)(Math.random()*500);
                int b = (int)(Math.random()*500);
                boolean i = random.nextBoolean();
                addOrSubtractAndPrint(a, b, i);
                return;
            } else {
                System.out.println("Вы ввели неверное число.");
            }

        } while (n < 0 || n > 5);

    }


    //метод greetings(), который при вызове должен отпечатать в столбец 4 слова: Hello, World, from, Java;
    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    //Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c.
    // Метод должен посчитать их сумму, и если она больше или равна 0,
    // то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;

    public static void checkSign(int a, int b, int c) {
        System.out.println("В аргументы переданы значение: " + a + ", " + b + ", " + c);

        int sum = a + b + c;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    //(3) Реализуйте метод selectColor() в теле которого задайте int переменную data с любым начальным значением.
    // Если data меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”, если от 10 до 20 включительно,
    // то “Желтый”, если больше 20 - “Зеленый”;
    public static void selectColor() {
        int data = 20;

        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {    // можно было использовать конструкцию (data > 10 && data <= 20)
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    //(4) Реализуйте метод compareNumbers(), в теле которого объявите две int переменные a и b с любыми начальными значениями.
    // Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
    public static void compareNumbers() {
        int a = 7;
        int b = 89;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //(5) Создайте метод addOrSubtractAndPrint(int initValue, int delta, boolean increment). Если increment = true,
    // то метод должен к initValue прибавить delta и отпечатать в консоль результат, в противном случае - вычесть;
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int result;
        System.out.println("В аргументы переданы значение: " + initValue + ", " + delta + ", " + increment);
        if (increment == true) {
            result = initValue + delta;
            System.out.println("Результат = " + result);
        } else {
            result = initValue - delta;
            System.out.println("Результат = " + result);
        }

    }
}