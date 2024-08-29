package ru.otus.exceptions;

import static java.lang.Integer.*;

public class mainApp {

    public static void main(String[] args) {

        String[][] array1 = {{"11", "3", "3", "5", "77"}, {"117", "5", "4", "14", "77"}, {"21", "22", "72", "25", "77"}, {"31", "32", "33", "30", "35"}};
        String[][] array2 = {{"11", "3", "3", "5"}, {"9", "5", "4", "14"}, {"21", "22", "8", "d"}, {"31", "32", "33", "35"}};
        String[][] array3 = {{"11", "3", "3", "5"}, {"9", "5", "4", "14"}, {"21", "22", "8", "1"}, {"31", "32", "33", "35"}};


        try {
            sumArray(array3);
            sumArray(array2);
            sumArray(array1);
        } catch (AppArrayDataException ex) {
            ex.printMessage();

        } catch (AppArraySizeException ex) {
            System.out.println("Передан массив другого размера");
        }
    }


    public static int sumArray(String[][] arr) {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new AppArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                try {
                    int num = parseInt(arr[i][j]);
                    sum += num;
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException(i, j);
                }
            }
        }
        System.out.println(sum);
        return sum;
    }
}

//Реализуйте метод, аргументом которого является двумерный строковый массив размером 4х4.
// Если передан массив другого размера необходимо бросить исключение AppArraySizeException.

//Метод должен обойти все элементы массива, преобразовать в int и просуммировать.
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит текст вместо числа),
// должно быть брошено исключение AppArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.

//В методе main() необходимо вызвать полученный метод, обработать возможные исключения AppArraySizeException
// и AppArrayDataException и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).