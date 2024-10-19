package ru.otus.m4.hw2_threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class printABC {
    static final Object mon = new Object(); // Монитор для синхронизации

    static boolean toPrintA = false;
    static boolean toPrintB = false;
    static boolean toPrintC = true;

    public static void main(String[] args) {
        try (ExecutorService executorService = Executors.newScheduledThreadPool(10)) {

            executorService.execute(() -> {
                synchronized (mon) {
                    try {
                        for (int i = 0; i < 5; i++) {
                            while (!toPrintC) {
                                mon.wait();
                            }
                            System.out.print("A");
                            toPrintA = true;
                            toPrintC = false;
                            mon.notifyAll();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            executorService.execute(() -> {
                synchronized (mon) {
                    try {
                        for (int i = 0; i < 5; i++) {
                            while (!toPrintA) {
                                mon.wait();
                            }
                            System.out.print("B");
                            toPrintB = true;
                            toPrintA = false;
                            mon.notifyAll();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            executorService.execute(() -> {
                synchronized (mon) {
                    try {
                        for (int i = 0; i < 5; i++) {
                            while (!toPrintB) {
                                mon.wait();
                            }
                            System.out.print("C");
                            toPrintC = true;
                            toPrintB = false;
                            mon.notifyAll();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            executorService.shutdown();
        }
    }
}


