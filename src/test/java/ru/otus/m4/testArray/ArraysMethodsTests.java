package ru.otus.m4.testArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

class ArraysMethodsTests {

    private static final int[] array0 = {1, 2, 2, 1, 2, 2};    //  => true
    private static final int[] array1 = {1};                   //  => false
    private static final int[] array2 = {1, 2};                //  => true
    private static final int[] array3 = {1, 1};                //  => false
    private static final int[] array4 = {1, 3 };               //  => false
    private static final int[] array5 = {};                    //  => false
    private static final int[] array6 = {4, 5, 0 } ;           //  => false
    private static final int[] expectedArray =  new int[]{2, 2};
    @Test
    void getNewArraySuccess() {
            Assertions.assertArrayEquals(expectedArray, ArraysMethods.getNewArray(array0));
        }


    @Test
    void containValueSuccess() {
        Assertions.assertTrue(ArraysMethods.containValue(array0));
    }
    void containValueOnlyOneValue() {
        Assertions.assertFalse(ArraysMethods.containValue(array1));
    }
    void containValueOneTwo() {
        Assertions.assertTrue(ArraysMethods.containValue(array2));
    }
    void containValueOnlyOne() {
        Assertions.assertFalse(ArraysMethods.containValue(array3));
    }
    void containValueTwoAbsent() {
        Assertions.assertFalse(ArraysMethods.containValue(array4));
    }
    void containValueEmptyArray() {
        Assertions.assertFalse(ArraysMethods.containValue(array5));
    }
    void containValueNoValidValues() {
        Assertions.assertFalse(ArraysMethods.containValue(array6));
    }

    //Дублирующий код, попробовала с параметрами
    @ParameterizedTest
    @CsvSource({
            "1,5", "1, 1" ,"1, 3", "4,5,0"
    })
    void containValueFalseExpected(String input) {
        int[] arr = Arrays.stream(input.split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        Assertions.assertFalse(ArraysMethods.containValue(arr));
    }

}