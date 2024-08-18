package ru.otus.basic.module2.hw4;

public class MainApp {
    public static void main(String[] args) {

        Person person1 = new Person("Ivan");

        Rover rover = new Rover(500, "RangeRover");
        Car car = new Car(100, "Kia Carnival");
        Bike bike = new Bike("Merida");
        Hourse hourse = new Hourse(80, "Buraya");

        person1.getOn(rover);
        person1.go(60, Terrain.LES);
        person1.go(60, Terrain.RAVNINA);
        person1.getOff(rover);

        person1.getOn(car);
        person1.go( 60, Terrain.RAVNINA);
        person1.go(60, Terrain.LES);
        person1.getOff(car);

        person1.getOn(bike);
        person1.go(60, Terrain.RAVNINA);
        person1.go( 60, Terrain.BOLOTO);
        person1.go( 560, Terrain.LES);
        person1.getOff(bike);

        person1.getOn(hourse);
        person1.go( 60, Terrain.BOLOTO);
        person1.go( 60, Terrain.RAVNINA);
        person1.go( 2000, Terrain.LES);
        person1.getOff(hourse);

        person1.go(40, Terrain.LES);
    }
}


//Создайте класс Человек с полями name (имя) и currentTransport (текущий транспорт)
//Реализуйте в вашем приложении классы Машина, Лошадь, Велосипед, Вездеход
//Каждый из классов должен предоставлять возможность перемещаться на определенное расстояние с указанием типа местности
//В приложении должны быть типы местности: густой лес, равнина, болото
//Человек должен иметь возможность сесть на любой из этих видов транспорта, встать с него, или переместиться
// на некоторое расстояние (при условии что он находится на каком-либо транспорте)
//При попытке выполнить перемещение у человека, не использующего транспорт, считаем что он просто идет указанное расстояние пешком
//При перемещении Машина и Вездеход тратят бензин, который у них ограничен.
// Лошадь тратит силы.
// Велосипед может использоваться без ограничений (можете для усложнения велосипедом тратить силы “водителя”).
// При выполнении действия результат должен быть отпечатан в консоль
//У каждого вида транспорта есть местности по которым он не может перемещаться: машина - густой лес и болото,
// лошадь и велосипед - болото, вездеход - нет ограничений

//При попытке переместиться должен быть возвращен результат true/false - удалось ли выполнить действие
