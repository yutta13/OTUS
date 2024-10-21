package ru.otus.m4.testArray;

import java.util.ArrayList;

public class ArrayDataException extends RuntimeException {
        public ArrayDataException() {
            super();
            printArrayDataException();
        }

        public void printArrayDataException() {
            System.out.println("Отсутствует значение 1 в массиве");
        }
}
