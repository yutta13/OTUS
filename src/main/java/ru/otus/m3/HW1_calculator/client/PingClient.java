package ru.otus.m3.HW1_calculator.client;
import java.io.*;
import java.net.Socket;


public class PingClient implements AutoCloseable {
    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;

    public PingClient(Socket sockets) throws IOException {
        this.inputStream = new DataInputStream(new BufferedInputStream(sockets.getInputStream()));
        this.outputStream = new DataOutputStream(new BufferedOutputStream(sockets.getOutputStream()));

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
