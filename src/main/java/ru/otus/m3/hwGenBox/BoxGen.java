package ru.otus.m3.hwGenBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxGen<T extends Fruit> {

    private ArrayList<T> fruitBox = new ArrayList<>();

    public BoxGen(T... fruitBox) {
        this.fruitBox = new ArrayList<>(Arrays.asList(fruitBox));
    }

    public ArrayList<T> getFruitBox() {
        return fruitBox;
    }
    public void setFruitBox(ArrayList<T> fruitBox) {
        this.fruitBox = fruitBox;
    }

    public void putFruit(T fruit) {
        fruitBox.add(fruit);
    }

    public void removeFruit(T fruit) {
        fruitBox.remove(fruit);
    }

    public Integer getWeight() {
        int result = 0;
        if (fruitBox.size() != 0) {
            for (T fruit : fruitBox) {
                result += fruit.fruitWeight;
            }
            return result;
        }
        return null;
    }

    public boolean compare(BoxGen<?> another) {
        return this.getWeight() == another.getWeight();
    }

    public void moveFruitsToBox(BoxGen<? super T> toBox) {
        if (fruitBox.size() != 0) {
            toBox.fruitBox.addAll(fruitBox);
            fruitBox.clear();
        }
    }
}



