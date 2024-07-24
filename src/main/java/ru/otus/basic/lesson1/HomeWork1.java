package ru.otus.basic.lesson1;

public class HomeWork1 {

    public static void main(String[] args) {
        greetings();
        checkSign();
        selectColor();
    }
    //метод greetings(), который при вызове должен отпечатать в столбец 4 слова: Hello, World, from, Java;
    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");

    }

    //Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c.
    // Метод должен посчитать их сумму, и если она больше или равна 0,
    // то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;

    public static void checkSign() {
        int a = 5 ;
        int b = 7 ;
        int c = -22 ;

        int sum = a + b+ c;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else
        {System.out.println("Сумма отрицательная");
        }

    }

    //(3) Реализуйте метод selectColor() в теле которого задайте int переменную data с любым начальным значением.
    // Если data меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”, если от 10 до 20 включительно,
    // то “Желтый”, если больше 20 - “Зеленый”;
    public static void selectColor(){
        int data = 20;

        if (data <= 10) {
            System.out.println("Красный");
        } else
        if (data <= 20){
            System.out.println("Желтый");
        }
            else
        {System.out.println("Зеленый");
        }
    }
}

