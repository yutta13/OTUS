package ru.otus.m2.HW_7_Array_list2;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, Integer> personContact;
    public PhoneBook() {
        personContact = new HashMap<>();
    }
   public void add(String fio, int number) {
        personContact.put(fio, number);
    }




}

//    public String getFio() {
//        return fio;
//    }
//
//    public void setFio(String fio) {
//        this.fio = fio;
//    }
//
//    public int getNumber() {
//        return number;
//    }
//
//    public void setNumber(int number) {
//        this.number = number;
//    }


//    List<PhoneBook> PhoneBook = new ArrayList<>(Arrays.asList(
//            new PhoneBook("Ivan", 30),
//            new PhoneBook("Nik", 70),
//            new PhoneBook("Sasha", 20),
//            new PhoneBook("Borya", 34),
//            new PhoneBook("Ivan Ivanov", 89),
//            new PhoneBook("Ivan Ivanov", 89),
//            new PhoneBook("Nik Mamontov1", 22),
//            new PhoneBook("Nik Mamontov3", 47)
//    ));


//        Map<String, Integer> phoneBook = new HashMap<>(
//        new PhoneBook("Ivan Ivanov", 89);
//        new PhoneBook("Ivan Ivanov", 89);
//        new PhoneBook("Nik Mamontov", 22);
//        new PhoneBook("Nik Mamontov", 47);
//
//





/*
Реализуйте класс PhoneBook, который хранит в себе список имен (фио) и телефонных номеров;

Метод add() должен позволять добавлять запись имя-телефон;
Метод find() выполнять поиск номер(-а, -ов) телефона по имени;

Под одним именем может быть несколько телефонов (в случае однофамильцев, или наличии у одного человека нескольких номеров), тогда при запросе такой фамилии должны выводиться все телефоны;
Метод containsPhoneNumber должен проверять наличие телефона в справочнике.
*/