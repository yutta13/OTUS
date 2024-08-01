package ru.otus.basic.modul2;

import java.util.Arrays;

public class Mainapp {
    public static void main(String[] args) {

        User[][] userArray = new User[][]{
                {new User("Ivan", "Mikovich", "Kashtanov", "mail@mail.ru", 39)},
                {new User("Nik2", "Mikovich", "Kashtanov", "mail@mail.ru", 20)},
                {new User("Nik3", "Mikovich", "Kashtanov", "mail@mail.ru", 17)},
                {new User("Nik4", "Mikovich", "Kashtanov", "mail@mail.ru", 56)},
                {new User("Nik5", "Mikovich", "Kashtanov", "mail@mail.ru", 12)},
                {new User("Nik6", "Mikovich", "Kashtanov", "mail@mail.ru", 1)},
                {new User("Nik7", "Mikovich", "Kashtanov", "mail@mail.ru", 99)},
                {new User("Nik8", "Mikovich", "Kashtanov", "mail@mail.ru", 105)},
                {new User("Nik9", "Mikovich", "Kashtanov", "mail@mail.ru", 00)},
                {new User("Nik10", "Mikovich", "Kashtanov", "mail@mail.ru", 40)}
        };


   }


        public static void usersAge (User[][] userArray){
            for (int i = 0; i < userArray.length ; i++) {
                for (int j = 4; j < userArray[i].length; j++) {
                    if (userArray[i][j] == 40 ){
                        System.out.println("ok");
                    }
                }

            }
//            for (int i = 0; i < userArray.length; i++) {
//                System.out.println(Arrays.deepToString(userArray));
//            }

        }
        ;
    }

//      User[] user2 = new User{"Nik2", "Mikovich", "Kashtanov", "mail@mail.ru",20};
//        User[] user3 = new User("Nik3", "Mikovich", "Kashtanov", "mail@mail.ru",17  );
//        User[] user4 = new User("Nik4", "Mikovich", "Kashtanov", "mail@mail.ru",56  );
//        User[] user5 = new User("Nik5", "Mikovich", "Kashtanov", "mail@mail.ru",12  );
//        User[] user6 = new User("Nik6", "Mikovich", "Kashtanov", "mail@mail.ru",1  );
//        User[] user7 = new User("Nik7", "Mikovich", "Kashtanov", "mail@mail.ru",99  );
//        User[] user8 = new User("Nik8", "Mikovich", "Kashtanov", "mail@mail.ru",105  );
//        User[] user9 = new User("Nik9", "Mikovich", "Kashtanov", "mail@mail.ru",00  );
//        User[] user10 = new User("Nik10", "Mikovich", "Kashtanov", "mail@mail.ru",40  );

//    User[] userArray = new User[]{
//            new User("Ivan", "Mikovich", "Kashtanov", "mail@mail.ru", 39),
//            new User("Nik2", "Mikovich", "Kashtanov", "mail@mail.ru", 20),
//            new User("Nik3", "Mikovich", "Kashtanov", "mail@mail.ru", 17),
//            new User("Nik4", "Mikovich", "Kashtanov", "mail@mail.ru", 56),
//            new User("Nik5", "Mikovich", "Kashtanov", "mail@mail.ru", 12),
//            new User("Nik6", "Mikovich", "Kashtanov", "mail@mail.ru", 1),
//            new User("Nik7", "Mikovich", "Kashtanov", "mail@mail.ru", 99),
//            new User("Nik8", "Mikovich", "Kashtanov", "mail@mail.ru", 105),
//            new User("Nik9", "Mikovich", "Kashtanov", "mail@mail.ru", 00),
//            new User("Nik10", "Mikovich", "Kashtanov", "mail@mail.ru", 40)};
//}

//    sumOfPositiveElements(new int[][]{{1, -2, -3}, {4, 0, 6}});
//        squareArrayInt(5);
//        nullDiagonalElements(new int[][]{{1, 2, 3, 5, 6}, {1, 2, 3, 5, 6}, {1, 2, 3, 5, 6}, {1, 2, 3, 5, 6}, {1, 2, 3, 5, 6}});
//        findMax(new int[][]{{-11, -2, -3, -5, -66}, {-118, -12, -13, -14, -16}, {-21, -22, -72, -25, -26}, {-31, -32, -33, -35, -36}, {-41, -42, -84, -45, -46}});
//        findMax(new int[][]{{-11, -2, -3, -5, -66}, {-118, -12, -13, -14, 516}, {-21, -22, -72, 25, -26}, {-31, -32, 33, 35, 36}, {-41, 42, 84, 45, 46}});
//        System.out.println(sumSecondLineElements(new int[][]{{1, 2, 3, 5, 66}, {31, 32, 33, 35, 36}, {1, 2, 1, 2, 1}}));
//        System.out.println(sumSecondLineElements(new int[][]{{1, 2, 3, 5, 66}, {31, 32, 33, 35, 36}}));
//        System.out.println(sumSecondLineElements(new int[][]{{1, 2, 3, 5, 66}}));