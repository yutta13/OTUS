package ru.otus.m2.HW_9_IO;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        File dir = new File("../JAVA_BASIC1");
        File[] listOfFiles = dir.listFiles();
        printRootDir(listOfFiles);

        Scanner scanner = new Scanner(System.in);
        System.out.println("select file ");

        String filename = scanner.next();
        printFromFile(filename + "\n");

        System.out.println("Ok, lets write to file : ");
        String tofile = scanner.next();
        writeToFile(tofile,filename);
        printFromFile(filename);

    }

    public static void printFromFile(String filename) {

        try (InputStreamReader in = new InputStreamReader(new FileInputStream(filename))) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(String tofile, String filename) {
       try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(filename, true))) {
            byte[] buffer = tofile.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

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


