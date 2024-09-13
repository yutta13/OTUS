package ru.otus.m3.HW1_calculator.server;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class MainApp {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true){
            System.out.println("Client connected!");
            Socket clientSocket = serverSocket.accept();
            ServSend servSend = new ServSend(clientSocket);
            servSend.info();
            servSend.readRequest();

        }
    }
}


//В коде из лекции в сервере создайте DataOutputStream по анлогии с PingClient и посмотрите что клиент получает
/*
Клиент-серверное приложение "Калькулятор"

Сервер: выполняет математические вычисления: +,-,*,/
Клиент-серверное взаимодействие:

клиент подключается к серверу, получает строку с доступными мат. операциями. Отображает ее пользователю.
пользователь вводит два числа и команду в консоль
отправляется запрос на сервер, сервер выполняет вычисления, возвращает результат клиенту.
клиент отображает результат в консоль

Критерии оценки:
реализовано клиентское приложение с консольным интерфейсом взаимодействия с пользователем (1 балл)
реализовано серверное приложение (3 балла)
* */