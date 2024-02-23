// Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный
// массив.
// Необходимо посчитать и вернуть сумму элементов этого массива.
// При этом накладываем на метод 2 ограничения: метод может работать только с
// квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке
// может лежать
// только значение 0 или 1.
// Если нарушается одно из условий, метод должен бросить RuntimeException с
// сообщением об
// ошибке.

public class Main {
    public static void main(String[] args) {
        int[][] matrix0 = new int[][] { { 0, 1, 1 }, { 0, 0, 1 }, { 1, 0, 0 } };
        int[][] matrix1 = new int[][] { { 0, 1, 1 }, { 0, 0, 1 } };
        int[][] matrix2 = new int[][] { { 0, 1, 1 }, { 0, 3, 1 }, { 1, 0, 0 } };

        sumElementsInMatrix(matrix0);
        // sumElementsInMatrix(matrix1);
        // sumElementsInMatrix(matrix2);
        // sumElementsInMatrix(null);
    }

    public static void sumElementsInMatrix(int[][] matrix) {
        if (matrix == null) {
            throw new RuntimeException("Matrix is null");
        }

        if (matrix.length != matrix[0].length) {
            throw new RuntimeException("Not square matrix");
        }

        int sum = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num == 0 || num == 1) {
                    sum += num;
                } else {
                    throw new RuntimeException("Not 0 1 matrix");
                }
            }
        }

        System.out.printf("sum=%d\n", sum);
    }
}