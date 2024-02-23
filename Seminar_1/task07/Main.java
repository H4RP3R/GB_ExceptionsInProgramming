// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и
// возвращающий новый массив, каждый элемент которого равен сумме элементов двух
// входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] a1 = new int[] { 1, 2, 3, 4 };
        int[] a2 = new int[] { 1, 1, 1, 1 };

        System.out.println(Arrays.toString(zipArrays(a1, a2)));
    }

    public static int[] zipArrays(int[] arr1, int[] arr2) throws Exception {
        if (arr1 == null || arr2 == null) {
            throw new Exception("Array is null");
        }

        if (arr1.length != arr2.length) {
            throw new Exception("Different length arrays");
        }

        int[] resArr = new int[arr1.length];

        for (int i = 0; i < resArr.length; i++) {
            resArr[i] = arr1[i] + arr2[i];
        }

        return resArr;
    }
}