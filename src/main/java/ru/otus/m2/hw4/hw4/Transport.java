package ru.otus.m2.hw4.hw4;

public interface Transport  {
    boolean getOn();
    boolean getOff();
    boolean move(int distance, Terrain terrain);
    String getName();
}
