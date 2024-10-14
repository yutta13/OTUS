package ru.otus.m4.hw1Io2;

import java.io.*;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        File dir = new File("../JAVA_BASIC1");
        File[] listOfFiles = dir.listFiles();
        printRootDir(listOfFiles);

        Scanner scanner = new Scanner(System.in);
        System.out.println("select file ");

        String filename = scanner.next();
        File file = new File(filename);

        if (file.exists()) {

            System.out.println("Ok, write symbols to be found : ");
            String sequenceToFound = scanner.next();

            int numberOfSequence = selectFileFoundSequence(file, sequenceToFound);
            System.out.println("Number of sequences " + sequenceToFound + " is " + numberOfSequence);
        } else
            System.out.println("File not founded ");
    }

    public static int selectFileFoundSequence(File file, String sequenceToFound) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.isEmpty()) {
                    count += countSequences(line, sequenceToFound);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return count;
    }

    public static int countSequences(String line, String tofound) {
        int count = 0;
        int position = 0;
        while ((position = line.indexOf(tofound, position)) != -1) {
            count++;
            position++;
        }
        return count;
    }

    public static void printRootDir(File[] listOfFiles) {
        for (File file : listOfFiles) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                String fileName = file.getName();
                System.out.print(fileName + "\n");
            }
        }
    }
}
