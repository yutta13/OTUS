package ru.otus.m3.HW1_calculator.server;
import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;


public class ServSend implements AutoCloseable{
    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;

    public ServSend(Socket sockets) throws IOException {
        this.inputStream = new DataInputStream(new BufferedInputStream(sockets.getInputStream()));
        this.outputStream = new DataOutputStream(new BufferedOutputStream(sockets.getOutputStream()));

    }
    public void info() throws IOException {
        String info = "Калькулятор. Введите подряд два числа через пробел и символ на выбор: \n" + "+\n" + "-\n" + "*\n" + "/\n";
        outputStream.writeUTF(info);
        outputStream.flush();
    }
    static void readRequest(Socket socket) throws IOException {
        DataInputStream input =  new DataInputStream(new BufferedInputStream(socket.getInputStream()));

        String str = input.readUTF();
        System.out.println("User input:" +str);
        // todo
        System.out.println("Result:" +str);

        socket.getOutputStream().write(str.getBytes(StandardCharsets.UTF_8));
        socket.getOutputStream().flush();

    }

    public String send(String string) throws IOException {
        outputStream.writeUTF(string);
        outputStream.flush();
        return string;
    }

    public String read() throws IOException {
        String result = inputStream.readUTF();
        return result;
    }


    @Override
    public void close() throws Exception {
        inputStream.close();
        outputStream.close();
    }
}
