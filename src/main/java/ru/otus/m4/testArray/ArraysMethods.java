package ru.otus.m4.testArray;

public class ArraysMethods {
    public static int[] getNewArray(int[] array) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                index = i;
            }
        }
        if (index == -1) {
            throw new ArrayDataException();
        }
        int[] newArray = new int[array.length - index - 1];
        for (int i = index + 1, j = 0; i < array.length; i++, j++) {
            newArray[j] = array[i];
        }
        return newArray;
    }

    public static boolean containValue(int[] array) {
        boolean containOne = false;
        boolean containTwo = false;
        if (array.length == 0) {
            System.out.println("Пустой массив");
            return false;
        }
        for (int i : array) {
            if (i == 1) {
                containOne = true;
            }
            if (i == 2) {
                containTwo = true;
            }
        }
        if (!containOne) {
        }
        return containOne & containTwo;
    }
}
