package ru.otus.basic.module2.hw4;

public class Person {
    private String name;

    public Transport getCurrentTransport() {
        return currentTransport;
    }

    public void setCurrentTransport(Transport currentTransport) {
        this.currentTransport = currentTransport;
    }

    private Transport currentTransport;

    public Person(String name) {
        this.name = name;
    }

//    public void go(int distance, Terrain terrain){
//        System.out.println(name + " идет пешком");
//    }

    public void go(int distance, Terrain terrain){
        if (getCurrentTransport() != null){
        getCurrentTransport().move(distance, terrain);
        return;
        }
        System.out.println(name + " идет пешком");

    }

    public void getOn(Transport transport){
        setCurrentTransport(transport);
        transport.getOn();
    }

    public void getOff(Transport transport){
        setCurrentTransport(null);
        transport.getOff();
    }



}

//Создайте класс Человек с полями name (имя) и currentTransport (текущий транспорт)
//Реализуйте в вашем приложении классы Машина, Лошадь, Велосипед, Вездеход
//Каждый из классов должен предоставлять возможность перемещаться на определенное расстояние с указанием типа местности
//В приложении должны быть типы местности: густой лес, равнина, болото Types of terrain: dense forest, plain, swamp
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