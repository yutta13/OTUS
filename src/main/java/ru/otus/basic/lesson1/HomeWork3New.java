package ru.otus.basic.lesson1;

public class HomeWork3New {
    public static void main(String[] args) {
        sumOfPositiveElements();
    }

    private static void sumOfPositiveElements() {
        System.out.println("exercise 1");
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}};

        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr[i].length; ++j) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }
}
