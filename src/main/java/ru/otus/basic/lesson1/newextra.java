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
        int[] arr1 = new int[]{1, 2, 3, 1, 1, 8, 9};
        int[] arr2 = new int[]{3, 0, 1, 4, 5};
        int[] arr3 = new int[]{5, 1, 3, 1, 1, 5};

        int n = Math.max(arr1.length, Math.max(arr2.length, arr3.length));
        int[] newSumArray = new int[n];
        arr1 = newArrayCreate(arr1, newSumArray);
        arr2 = newArrayCreate(arr2, newSumArray);
        arr3 = newArrayCreate(arr3, newSumArray);


        for (int i = 0; i < newSumArray.length; ++i) {
            newSumArray[i] = arr1[i] + arr2[i] + arr3[i];
        }
        System.out.println(Arrays.toString(newSumArray));
    }

    public static int[] newArrayCreate(int[] elementOld,int[] elementNew) {
        int n = 0;
        if (elementNew.length >=elementOld.length)
        {n = elementNew.length;
        } else
        {n = elementOld.length;}

        int[] newArray2 = new int[n];
        int[] element;
        for (int i = 0; i < elementOld.length; i++) {
            newArray2[i] = elementOld[i];
        }
        element = newArray2;
        return element;
        }
    }

