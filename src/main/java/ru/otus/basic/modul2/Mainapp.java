package ru.otus.basic.modul2;
public class Mainapp {
    public static void main(String[] args) {
        User[] userArray = new User[]{
                new User("Ivan", "Mikovich", "Kashtanov", "mail@mail.ru", 39),
                new User("Nik2", "Mikovich", "Kashtanov", "mail@mail.ru", 20),
                new User("Nik3", "Mikovich", "Kashtanov", "mail@mail.ru", 17),
                new User("Nik4", "Mikovich", "Kashtanov", "mail@mail.ru", 56),
                new User("Nik5", "Mikovich", "Kashtanov", "mail@mail.ru", 12),
                new User("Nik6", "Mikovich", "Kashtanov", "mail@mail.ru", 1),
                new User("Nik7", "Mikovich", "Kashtanov", "mail@mail.ru", 99),
                new User("Nik8", "Mikovich", "Kashtanov", "mail@mail.ru", 105),
                new User("Nik9", "Mikovich", "Kashtanov", "mail@mail.ru", 00),
                new User("Nik10", "Mikovich", "Kashtanov", "mail@mail.ru", 40)};

        usersAge(userArray);
    }



    public static void usersAge(User[] arr) {
        int minAge = 40;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() > 40){
                arr[i].printInfo();
            }
        }
    }
}

