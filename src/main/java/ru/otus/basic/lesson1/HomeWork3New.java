package ru.otus.basic.lesson1;


public class HomeWork3New {
    public static void main(String[] args) {

        sumOfPositiveElements(new int[][]{{1, -2, -3}, {4, 0, 6}});
        squareArrayInt(5);
        nullDiagonalElements(new int[][]{{1, 2, 3, 5, 6}, {1, 2, 3, 5, 6}, {1, 2, 3, 5, 6}, {1, 2, 3, 5, 6}, {1, 2, 3, 5, 6}});
        findMax(new int[][]{{-11, -2, -3, -5, -66}, {-118, -12, -13, -14, -16}, {-21, -22, -72, -25, -26}, {-31, -32, -33, -35, -36}, {-41, -42, -84, -45, -46}});
        findMax(new int[][]{{-11, -2, -3, -5, -66}, {-118, -12, -13, -14, 516}, {-21, -22, -72, 25, -26}, {-31, -32, 33, 35, 36}, {-41, 42, 84, 45, 46}});
        sumSecondLineElements(new int[][]{{1, 2, 3, 5, 66}, {31, 32, 33, 35, 36}, {1, 2, 1, 2, 1}});
        sumSecondLineElements(new int[][]{{1, 2, 3, 5, 66}, {31, 32, 33, 35, 36}});
    }

    public static int sumOfPositiveElements(int[][] arr) {
        System.out.println("exercise 1");
        int sum = 0;

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static void squareArrayInt(int n) {
        System.out.println("exercise 2");
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void nullDiagonalElements(int[][] arr) {
        System.out.println("exercise 3");

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                if (j == i) {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int findMax(int[][] array) {
        System.out.println("exercise 4");
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array.length; ++j) {
                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                }
            }
        }
        System.out.println(maxElement);
        return maxElement;
    }

    public static int sumSecondLineElements(int[][] array) {
        System.out.println("exercise 5");
        int sum = 0;
        if (array.length <= 2) {
            sum = -1;
            System.out.println(sum);
            return sum;
        } else

            for (int i = 2; i < array.length; ++i) {
                for (int j = 0; j < array[i].length; ++j) {
                    sum += array[i][j];
                }
                System.out.println(sum);
            }
        return sum;
    }
}


//        for(int i = 0; i < arr.length; ++i) {
//        for(int j = 0; j < arr[i].length; ++j) {
//          System.out.print(arr[i][j] + " ");
//          }
//               System.out.println();
//                  }
//                   System.out.println();


//        Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив,
//        метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;

//        Реализовать метод, который принимает в качестве аргумента int size и печатает в консоль квадрат из символов *
//        со сторонами соответствующей длины;

//        Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив, и зануляющий его
//        диагональные элементы (можете выбрать любую из диагоналей, или занулить обе);

//        Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;

//        Реализуйте метод, который считает сумму элементов второй строки двумерного массива, если второй
//        строки не существует, то в качестве результата необходимо вернуть -1