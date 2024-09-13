package ru.otus.m3.HW1_calculator.server;

import java.io.*;
import java.net.Socket;

public class ServSend implements AutoCloseable {
    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;

    public ServSend(Socket sockets) throws IOException {
        this.inputStream = new DataInputStream(new BufferedInputStream(sockets.getInputStream()));
        this.outputStream = new DataOutputStream(new BufferedOutputStream(sockets.getOutputStream()));

    }

    public void info() throws IOException {
        String info = "Я Калькулятор. Введите подряд два числа через пробел и символ на выбор: \n" + "+\n" + "-\n" + "*\n" + "/\n";
        outputStream.writeUTF(info);
        outputStream.flush();
    }

    public String[] getFormula() throws IOException {
        String formula = inputStream.readUTF();
        String[] valuesOfFormula = formula.split(" ");
        if (valuesOfFormula.length != 3) {
            outputStream.writeUTF("Неверный набор значений");
            outputStream.flush();
        }
        return valuesOfFormula;
    }

    public String calculate(String[] formula) {
        try {
            String result = null;
            int a = Integer.parseInt(formula[0]);
            int b = Integer.parseInt(formula[1]);
            String sign = formula[2];

            if (sign.equals("+")) {
                result = String.valueOf(a + b);
            }
            if (sign.equals("-")) {
                result = String.valueOf(a - b);
            }
            if (sign.equals("*")) {
                result = String.valueOf(a * b);
            }
            if (sign.equals("/")) {
                if (b == 0) {
                    throw new ArithmeticException("Делить на 0 запрещено");
                }
                result = String.valueOf((float) a / b);
            }

            return result;

        } catch (NumberFormatException e) {
            throw new NumberFormatException("Введены неверные значение");
        }
    }

    public void readRequest() throws IOException {

        String result = calculate(getFormula());
        outputStream.writeUTF("answer " + result);
        outputStream.flush();

    }

    @Override
    public void close() throws Exception {
        inputStream.close();
        outputStream.close();
    }
}
