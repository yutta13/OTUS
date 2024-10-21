package ru.otus.m4.testArray;

import static ru.otus.m4.testArray.ArraysMethods.containValue;
import static ru.otus.m4.testArray.ArraysMethods.getNewArray;

public class MainApp {
    public static void main(String[] args) {
        int[] array1 = {1, 2};
        int[] array4 = {1, 2, 2, 1, 2, 2};
        int[] array0 = {};
        int[] array2 = {1, 1};
        int[] array3 = {1, 3};
        int[] array5 = {4, 5};
        int[] array6 = {1,2,4,5};
        int[] array7 = {2,2,2};

        getNewArray(array4);
        System.out.println(containValue(array6));
        System.out.println(containValue(array4));
    }
}