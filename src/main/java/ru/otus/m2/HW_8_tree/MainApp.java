package ru.otus.m2.HW_8_tree;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {
        Person person1 = new Person("Ivan", Position.DIRECTOR, 11111L);
        Person person2 = new Person("Maria", Position.QA, 22222L);
        Person person3 = new Person("Juan", Position.DRIVER, 33333L);
        Person person4 = new Person("Mike", Position.DEVELOPER, 4L);
        Person person5 = new Person("Sergey", Position.ENGINEER, 5L);

        Person person6 = new Person("Kolya", Position.DRIVER, 6666L);

        Map<Long,Person> personDataMap = new HashMap<>();
        personDataMap.put(person1.getId(), person1);
        personDataMap.put(person2.getId(), person2);
        personDataMap.put(person3.getId(), person3);
        personDataMap.put(person4.getId(), person4);
        personDataMap.put(person5.getId(), person5);

        PersonDataBase personDataBase = new PersonDataBase(personDataMap);

        personDataBase.findById(33333L);
        personDataBase.add(person6);
        System.out.println(personDataBase.isManager(person1));
        System.out.println(personDataBase.isManager(person6));

        System.out.println(personDataBase.isEmployee(11111L));
        System.out.println(personDataBase.isEmployee(6666L));


    }
}
