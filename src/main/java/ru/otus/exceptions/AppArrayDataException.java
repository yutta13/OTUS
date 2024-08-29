package ru.otus.exceptions;

public class AppArrayDataException extends RuntimeException {
    private int row;
    private int col;

    public AppArrayDataException(int row, int col) {
        super();
        this.row = row;
        this.col = col;
    }

    public void printMessage() {
        System.out.println("Не числовой формат данных в ячейке : " + "[" + row + "]" + "[" + col + "]");
    }

}

