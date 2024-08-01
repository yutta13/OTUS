package ru.otus.basic.modul2;

public class Box {

    private final int length;
    private final int width;
    private final int height;
    private String color;
    private boolean open;
    private String item;


    public Box(int length, int width, int height, String color, boolean open) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.open = open;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    //Добавляем предмет в коробки
    public void putItem(String someItem) {
        if (open) {
            if (item == null) {
                item = someItem;
                System.out.println(someItem + " теперь в вашей коробке");
            } else {
                System.out.println("В коробке уже есть предмет");
            }
        } else {
            System.out.println("Коробка закрыта. Откройте коробку");
        }
    }

    //Убираем предмет из коробки
    public void deleteItem(String someItem) {
        if (open) {
            if (item != null) {
                item = null;
                System.out.println(someItem + " убрали из коробки");
            } else {
                System.out.println("В коробке ничего нет");
            }
        } else {
            System.out.println("Коробка закрыта. Откройте коробку");
        }
    }

    //Выводим инфо о коробке
    public void printInfo() {
        System.out.println("\nРазмеры коробки ШхДхВ: " + width + "x" + length + "х" + height +
                "\nЦвет: " + color + "\nСостояние коробки: " + isOpen());
    }

    //Открыта ли коробка
    public String isOpen() {
        if (open) {
            String isOpenNow = "Открыта";
            return isOpenNow;
        }
        String isCloseNow = "Закрыта";
        return isCloseNow;
    }

    //Открываем коробку
    public void toOpen() {
        if (!open) {
            setOpen(true);
            System.out.println("\nВы открыли коробку");
        } else {
            System.out.println("\nКоробка уже открыта");
        }
    }

    //Закрываем коробку
    public void toClose() {
        if (open) {
            setOpen(false);
            System.out.println("\nВы закрыли коробку");
        } else {
            System.out.println("\nКоробка уже была закрыта");
        }

    }

    //Кладем предмет в коробку


}


//    Попробуйте реализовать класс по его описания:
//    объекты класса Коробка должны иметь размеры и цвет.
//    Коробку можно открывать и закрывать.
//    Коробку можно перекрашивать.
//    Изменить размер коробки после создания нельзя.
//    У коробки должен быть метод, печатающий информацию о ней в консоль.

//    В коробку можно складывать предмет (если в ней нет предмета), или выкидывать его оттуда
//    (только если предмет в ней есть), только при условии что коробка открыта (предметом читаем просто строку).
