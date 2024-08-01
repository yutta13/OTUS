package ru.otus.basic.modul2;

import java.time.Year;

public class User {
    private String name;
    private String surname;
    private String midname;
    private String email;
    private int age;

    public int getAge() {
        return age;
    }
    public User(String name, String surname, String midname, String email, int age){
        this.name = name;
        this.surname = surname;
        this.midname = midname;
        this.email = email;
        this.age=age;
    }
    public void printInfo(){
        System.out.println("\nФИО: " + surname + " "+ name + " " + midname + "\nГод рождения: " + birthYearCalc(age) + "\ne-mail: " + email);
    }


    public int birthYearCalc(int age){
        int currentYear = Year.now().getValue();
        int birthYear = currentYear - age;
        return birthYear;
    }

}
