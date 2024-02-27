import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    }

    public static int sumElementsArray(String[][] array) {
        if (array.length != 4 && array[0].length != 4)
            throw new MyArraySizeException(array.length, array[0].length);
        int resultSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    resultSum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return resultSum;
    }
}

class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(int row, int column) {
        super("Размеры заданы неверно: (" + row + ", " + column + ")");
    }

    public MyArraySizeException() {
        super("Размеры заданы неверно");
    }
}

class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int i, int j) {
        super("Невозможно сделать конвертацию: (" + i + ", " + j + ")");
    }

    public MyArrayDataException() {
        super("Невозможно сделать конвертацию");
    }
}
