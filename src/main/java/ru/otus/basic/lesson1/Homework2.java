package ru.otus.basic.lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr4 = new int[12];
        int[] arr5 = new int[12];

        metOne(3, "rain");
        metTwo(new int[]{1, 2, 3, 1, 1, 8, 6, 4, 7, 1, 12});
        metThree(3, arr);
        metFour(7, arr4);
        metFive(arr5);
    }

    // Реализуйте метод, принимающий в качестве аргументов целое число и строку, и печатающий в консоль строку указанное количество раз
    public static void metOne(int a, String abc) {
        System.out.println("\nЗадание 1.");
        for (int i = 0; i < a; i++) {
            System.out.println(abc);
        }
    }


    // Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все элементы, значение которых больше 5,
    // и печатающий полученную сумму в консоль.
    public static void metTwo(int[] arr1) {
        System.out.println("\nЗадание 2.");
        int result = 0;
        for (int i = 0; i < arr1.length; i++) {  //вычисляем сумму элементов >5
            if (arr1[i] > 5) {
                result += arr1[i];
            }
        }
        System.out.println("Массив  - " + Arrays.toString(arr1) + " Сумма = " + result);
    }


    // Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
    // метод должен заполниться каждую ячейку массива указанным числом.
    public static void metThree(int a, int[] arr) {
        System.out.println("\nЗадание 3.");
        //       arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
        }
        System.out.println(Arrays.toString(arr));
    }


    // Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
    // увеличивающий каждый элемент которого на указанное число.
    public static void metFour(int a, int[] arr4) {
        System.out.println("\nЗадание 4.");
        for (int i = 0; i < arr4.length; i++) {  //заполнили пустой массив числами, либо можно использовать ссылку на массив из Задания3)
            arr4[i] = i;
        }
        for (int i = 0; i < arr4.length; i++) { //Увеличили на -а- каждый элемент
            arr4[i] += a;
        }
        System.out.println(Arrays.toString(arr4));
    }

    // Реализуйте метод, принимающий в качестве аргумента целочисленный массив,
    // и печатающий в консоль сумму элементов какой из половин массива больше.
    public static void metFive(int[] arr5) {
        int leftSum = 0;
        int rightSum = 0;
        System.out.println("\nЗадание 5.");
        for (int i = 0; i < arr5.length; i++) {  //заполнили пустой массив числами)
            arr5[i] = (int) (Math.random() * 10);
        }
        System.out.println("Массив : " + Arrays.toString(arr5));

        for (int i = 0; i < arr5.length / 2; i++) {
            leftSum += arr5[i];
        }
        for (int i = arr5.length / 2; i < arr5.length; i++) {
            rightSum += arr5[i];
        }

        if (leftSum > rightSum) {
            System.out.println("Сумма левой половины массива = " + leftSum);
        } else {
            System.out.println("Сумма правой половины массива = " + rightSum);
        }
    }
}

