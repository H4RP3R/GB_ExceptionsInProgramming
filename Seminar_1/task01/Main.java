// Реализуйте метод, принимающий в качестве аргумента целочисленный массив и
// некоторое
// значение. Метод ищет в массиве заданное значение и возвращает его индекс. При
// этом,
// например:
// 1. если длина массива меньше некоторого заданного минимума, метод возвращает
// -1, в
// качестве кода ошибки.
// 2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
// 3. если вместо массива пришел null, метод вернет -3
// 4. придумайте свои варианты исключительных ситуаций и верните соответствующие
// коды ошибок.
// Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть,
// этот
// метод запросит искомое число у пользователя, вызовет первый, обработает
// возвращенное
// значение и покажет читаемый результат пользователю. Например, если вернулся
// -2,
// пользователю выведется сообщение: “Искомый элемент не найден”.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int MIN_ARR_LENGTH = 4;
        UI ui = new UI();

        int[] arr = ui.getInputArray(iScanner);
        int num = ui.getItemForSearch(iScanner);
        int result = findInArray(arr, num, MIN_ARR_LENGTH);
        ui.processResult(result);
        iScanner.close();
    }

    public static int findInArray(int[] arr, int item, int minArrLength) {
        if (arr == null) {
            return -3;
        }

        if (arr.length < minArrLength) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }

        return -2;
    }
}