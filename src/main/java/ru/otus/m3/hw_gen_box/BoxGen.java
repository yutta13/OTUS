package ru.otus.m3.hw_gen_box;

import java.util.ArrayList;
import java.util.Arrays;

public class BoxGen<T extends Fruit> {
    public ArrayList<T> getFruitBox() {
        return fruitBox;
    }

    public void setFruitBox(ArrayList<T> fruitBox) {
        this.fruitBox = fruitBox;
    }

    private ArrayList<T> fruitBox = new ArrayList<>();

    public BoxGen(T... fruitBox) {
        this.fruitBox = new ArrayList<>(Arrays.asList(fruitBox));
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
                result += fruit.fruit_weight;
            }
            return result;
        }
        return null;
    }

    public boolean compare(BoxGen<?> another) {
        return this.getWeight() == another.getWeight();
    }

    public void putThistoAnother(BoxGen<Fruit> toBox) {
        if (fruitBox.size() != 0) {
            System.out.println("Before.  fromBox: " + fruitBox.size());
            System.out.println("Before.  toBox: " + toBox.fruitBox.size());
            toBox.fruitBox.addAll(fruitBox);
            fruitBox.clear();
            System.out.println("After.  fromBox: " + fruitBox.size());
            System.out.println("After.  toBox: " + toBox.fruitBox.size());
        }
    }
}



