package ru.otus.m3.HW1_calculator.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MainApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8888);
             PingClient client = new PingClient(socket)) {
            System.out.println(client.read());
            String userInput = scanner.nextLine();
            client.send(userInput);
            System.out.println(client.read());

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

/*
Клиент-серверное приложение "Калькулятор"

Сервер: выполняет математические вычисления: +,-,*,/
Клиент-серверное взаимодействие:
sd
клиент подключается к серверу, получает строку с доступными мат. операциями. Отображает ее пользователю.
пользователь вводит два числа и команду в консоль
отправляется запрос на сервер, сервер выполняет вычисления, возвращает результат клиенту.
клиент отображает результат в консоль

Критерии оценки:
реализовано клиентское приложение с консольным интерфейсом взаимодействия с пользователем (1 балл)
реализовано серверное приложение (3 балла)
* */