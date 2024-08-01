package ru.otus.basic.modul2;

import java.util.Arrays;

public class Mainapp {
    public static void main(String[] args) {
        User user1 = new User("Nik", "Mikovich", "Kashtanov", "mail@mail.ru",39  );
        User user2 = new User("Nik2", "Mikovich", "Kashtanov", "mail@mail.ru",20  );
        User user3 = new User("Nik3", "Mikovich", "Kashtanov", "mail@mail.ru",17  );
        User user4 = new User("Nik4", "Mikovich", "Kashtanov", "mail@mail.ru",56  );
        User user5 = new User("Nik5", "Mikovich", "Kashtanov", "mail@mail.ru",12  );
        User user6 = new User("Nik6", "Mikovich", "Kashtanov", "mail@mail.ru",1  );
        User user7 = new User("Nik7", "Mikovich", "Kashtanov", "mail@mail.ru",99  );
        User user8 = new User("Nik8", "Mikovich", "Kashtanov", "mail@mail.ru",105  );
        User user9 = new User("Nik9", "Mikovich", "Kashtanov", "mail@mail.ru",00  );
        User user10 = new User("Nik10", "Mikovich", "Kashtanov", "mail@mail.ru",40  );
        user1.info();

        User[][] usersArray = new User[10][5];
        System.out.println(Arrays.deepToString(new User[]{usersArray[1][2]}));



    }
}
