package ru.otus.m2.HW_7_Array_list2;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> personContactMap;

    public PhoneBook() {
        personContactMap = new HashMap<>();
    }

    /**
     * Метод add() должен позволять добавлять запись имя-телефон;
     * Под одним именем может быть несколько телефонов (в случае однофамильцев, или наличии
     * у одного человека нескольких номеров)
     * @param fio ФИО
     * @param phoneNumber Номер телефона
     */
    public void add(String fio, String phoneNumber) {
        List<String> phoneNumbers = personContactMap.getOrDefault(fio, new ArrayList<>());
        phoneNumbers.add(phoneNumber);
        personContactMap.put(fio, phoneNumbers);
    }

    /**
     * Метод find() выводит спривочник телефонов
     */
    public void info() {
        System.out.println(personContactMap);
    }

    /**
     * Метод find() выполнять поиск номер(-а, -ов) телефона по имени;
     * Под одним именем может быть несколько телефонов (в случае однофамильцев, или наличии
     * у одного человека нескольких номеров), тогда при запросе такой фамилии должны выводиться все телефоны;
     * @param fio ФИО
     */
    public void find(String fio) {
        if (personContactMap.containsKey(fio)) {
            List<String> number = new ArrayList<>(personContactMap.get(fio));
            System.out.println(Arrays.asList(number));
        } else {
            System.out.println("Not founded");
        }
    }

    /**
     * Метод containsPhoneNumber должен проверять наличие телефона в справочнике.
     * @param phoneNumber номер телефона
     * @return да/нет наличие телефона в справочнике
     */
    public boolean containsPhoneNumber(String phoneNumber) {
        for (List<String> numbers : personContactMap.values()) {
            if (numbers.contains(phoneNumber)) {
                System.out.println("Найден телефон " + phoneNumber );
                return true;
            }
        }
        System.out.println("Не найден телефон ");
        return false;
    }
}



