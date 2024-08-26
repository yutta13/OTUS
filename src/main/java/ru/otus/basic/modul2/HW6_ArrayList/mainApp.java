package ru.otus.basic.modul2.HW6_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class mainApp {
    public static void main(String[] args) {
//        List<Integer> list = elements(0, 5);
//        System.out.println(list);
//        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 5, 2, 3, 6, 10, 20, 0, 0, 0, 7));
//        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 5, 2, 3, 6, 10, null, 0, 0, 0, 7));
//        System.out.println(sumElements(list2));
//        setElement(4, list3);
//        increaseElement(2, list2);
        List<Employee> employeeList = new ArrayList<>(Arrays.asList(
                new Employee("Ivan", 30),
                new Employee("Nik", 70),
                new Employee("Sasha", 20),
                new Employee("Borya", 34)
        ));

        employeeNamesList(employeeList);
        //     ageGreaterFilterList(employeeList, 30);
        averageAgeList(employeeList, 38);

    }

    public static List<Integer> elements(int min, int max) {
        List<Integer> listElements = new ArrayList<>();
        for (int i = min; i < max + 1; i++) {
            listElements.add(i);
        }
        return listElements;
    }

    public static int sumElements(List<Integer> list) {
        int sum = 0;
        for (Integer s : list) {
            if (s > 5) {
                sum += s;
            }
        }
        return sum;
    }

    public static void setElement(int n, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                list.set(i, n);
            }
        }
        System.out.println(list);
    }

    public static void increaseElement(int n, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int newValue = n + list.get(i);
            list.set(i, newValue);
        }
        System.out.println(list);
    }

    public static List<String> employeeNamesList(List<Employee> employeeList) {
        List<String> namesList = new ArrayList<>();
        for (Employee employee : employeeList) {
            namesList.add(employee.getName());
        }
        System.out.println(namesList);
        return namesList;
    }

    public static List<Employee> ageGreaterFilterList(List<Employee> employeeList, int minAge) {
        List<Employee> employeeListGrater = employeeList;
        Iterator<Employee> iter = employeeList.iterator();
        while (iter.hasNext()) {
            if (iter.next().getAge() < minAge) {
                iter.remove();
            }
        }
        for (Employee employee : employeeList) {
            System.out.println(employee.getName() + " - " + employee.getAge());
        }
        return employeeListGrater;
    }

    public static boolean averageAgeList(List<Employee> employeeList, int averageAge) {
        int average = 0;
        int resultAvAge;
        for (Employee employee : employeeList) {
            average += employee.getAge();
        }
        resultAvAge = average / employeeList.size();
        if (resultAvAge > averageAge) {
            System.out.println("Средний возраст сотрудников : " + resultAvAge + " превышает заданный средний возраст - " + averageAge);
            return true;
        }
        System.out.println("Средний возраст сотрудников : " + resultAvAge + " не превышает заданный средний возраст - " + averageAge);
        return false;
    }

    public static Employee youngerEmployee(List<Employee> employeeList) {
        int min = 0;
        while (min) {
            for (Employee employee : employeeList) {
                int x = employee.getAge();
            }

        }

    }

}


//    Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий ссылку на самого молодого сотрудника.
