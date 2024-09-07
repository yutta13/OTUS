package ru.otus.m2.HW_8_tree;


public class Person {
    public Person(String name, Position position, Long id) {
        this.name = name;
        this.position = position;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public Position getPosition() {
        return position;
    }
    public Long getId() {
        return id;
    }

    String name;
    Position position;
    Long id;

}

