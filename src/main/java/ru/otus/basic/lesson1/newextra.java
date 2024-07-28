package ru.otus.basic.lesson1;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;

public class newextra {
    public newextra() {
    }

    public static void main(String[] args) {
        sumArray();
    }

    public static void sumArray() {
        int[] arr1 = new int[]{1, 2, 3, 1, 1};
        int[] arr2 = new int[]{3, 0, 1, 4, 5};
        int[] arr3 = new int[]{5, 1, 3, 1, 1};

        int n = Math.max(arr1.length, Math.max(arr2.length, arr3.length));
        int[] newSumArray = new int[n];

        for (int i = 0; i < newSumArray.length; ++i) {
            newSumArray[i] = arr1[i] + arr2[i] + arr3[i];
        }
        System.out.println(Arrays.toString(newSumArray));
    }
}

//        Копируем элементы из старого массива в новый
//        while (true)
//        {int[] newArray = new int[n];
//            for (int i = 0; i < arr1.length; i++) {
//
//            newArray[i] = arr1[i];
//        }
//            arr1 = newArray;
//        }