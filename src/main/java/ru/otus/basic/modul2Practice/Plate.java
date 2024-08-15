package ru.otus.basic.modul2Practice;

public class Plate {
    int maxFood;
    int currentFood;

    public Plate(int maxFood, int currentFood) {
        this.maxFood = maxFood;
        this.currentFood = currentFood;
    }

    /**
     * метод, позволяющий добавить еду в тарелку
     *
     * @param food
     */
    public void addFood(int food) {
        if(food < 0) {
            System.out.println("Значение еды отрицательное");
            return;
        }
        if (currentFood < 0) {
            currentFood = 0;
        }
        currentFood += food;
        if (currentFood > maxFood) {
            currentFood = maxFood;
        }
    }

    /**
     * метод уменьшения количества еды
     *
     * @param food
     * @return
     */
    public boolean decreaseFood(int food) {
        if (currentFood - food >= 0) {
            currentFood -= food;
            System.out.println("There is enough food on the plate. Food decreased. Current value = " + currentFood);
            return true;
        }
        System.out.println("There is not enough food on the plate. Current food stays = " + currentFood);
        return false;
    }
}