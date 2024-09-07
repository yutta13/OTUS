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

/*
* Реализуйте приложение, позволяющее работать с текстовыми файлами

* При старте приложения, в консоль выводится список текстовых файлов из корневого каталоге проекта
Далее программа запрашивает имя файла, с которым хочет работать пользователь
Содержимое файла выводится в консоль
Затем любую введенную пользователем строку необходимо записывать в указанный файл

* */

    /*
            File file = new File("D:\\otus");
        if (file.isDirectory()) {
            System.out.println(Arrays.toString(file.list()));
        }else {
            System.out.println("Not a directory");
        }
     */


/*  чтение с учетом кодировки
try (InputStreamReader in = new InputStreamReader(new FileInputStream("demo.txt"))) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char ) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
* */
/* пример с массивом
    public void readExample(){
    try (FileInputStream in = new FileInputStream("demo.txt")) {
        byte[] buf = new byte[64];
        int n = in.read(buf);
            while (n > 0) {
                System.out.print(new String(buf, 0, n));
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    */



  /*  пример с буфером (8192 б запрашивает и хранит у себя)
            try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("demo.txt"))) {
        int n = in.read();
        while (n != -1) {
            System.out.print((char)n);
            n = in.read();
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
            */

    /*
    public static void main(String[] args) {
    File rootDirectory = new File(System.getProperty("user.dir")); // Получаем корневую директорию проекта
    File[] files = rootDirectory.listFiles(); // Получаем список файлов в корневой директории

    if (files != null) {
        System.out.println("Список текстовых файлов в корневой директории проекта:");
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                System.out.println(file.getName());
            }
        }
    } else {
        System.out.println("В корневой директории проекта нет файлов");
    }
}

    * */


