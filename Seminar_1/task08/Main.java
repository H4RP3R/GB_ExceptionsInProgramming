// Реализуйте метод, принимающий в качестве аргументов двумерный массив.
// Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
// детализировать какие строки со столбцами не требуется.
// Как бы вы реализовали подобный метод?

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[][] {
                { 1, -4, 12, 6 },
                { 2, 4, 0, 0 },
                { 7, 0, 4, 11 },
                { 1, 0, -3, 8 },
        };

        System.out.println(validateArray(arr));
    }

    public static boolean validateArray(int[][] array) {
        int minLength = Math.min(array.length, array[0].length);
        for (int i = 0; i < minLength; i++) {
            int rowCount = 0;
            int colCount = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != 0) {
                    rowCount++;
                }
                if (array[j][i] != 0) {
                    colCount++;
                }
            }
            if (rowCount != colCount) {
                return false;
            }
        }
        return true;
    }
}