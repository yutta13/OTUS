package ru.otus.m2.HW_7_Array_list2;

public class mainApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Nik Sergeevich", ("94"));
        phoneBook.add("Ivan Petrovich", ("222222222"));
        phoneBook.add("Michail Ivanovich", ("333333333"));
        phoneBook.add("Anna Ioanovna", ("555555555"));
        phoneBook.add("Alex Kuzmich", ("444444444"));
        phoneBook.add("Anna Ioanovna", ("666666666"));

        phoneBook.info();
        phoneBook.find("Anna Ioanovna");

        phoneBook.containsPhoneNumber("666666666");
        phoneBook.containsPhoneNumber("333666666");

    }
}
