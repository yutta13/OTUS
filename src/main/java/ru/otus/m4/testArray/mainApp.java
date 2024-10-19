package ru.otus.m4.testArray;

import static ru.otus.m4.testArray.ArraysMethods.containValue;
import static ru.otus.m4.testArray.ArraysMethods.getNewArray;

public class mainApp {
    public static void main(String[] args) {

        int[] array0 = {};           //[ ] => false
        int[] array1 = {1, 2};           //[ 1 2 ] => true
        int[] array2 = {1, 1};           //[ 1 1 ] => false
        int[] array3 = {1, 3};           // [ 1 3 ] => false
        int[] array4 = {1, 2, 2, 1, 2, 2};   // [ 1 2 2 1 ] => true
        int[] array5 = {4, 5};   // [ 4 5 ] => false

        getNewArray(array0);

    }
}