package ru.otus.m2.HW_7_Array_list2;

import java.util.*;

public class mainapp extends PhoneBook {
    public mainapp(String fio, int number) {
        super(fio, number);
    }

    public static void main(String[] args) {

        Map<String, Integer> phoneBookMap = new HashMap<>();
    }



        public static Map<String, Integer> add(String fio, int number) {
        Map<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put(fio, number);
        return phoneBook;
    }

}
