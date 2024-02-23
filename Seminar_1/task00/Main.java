// Реализуйте метод, принимающий в качестве аргумента
// целочисленный массив.
// Если длина массива меньше некоторого заданного минимума,
// метод возвращает -1, в качестве кода ошибки, иначе - длину
// массива.

public class Main {
    public static void main(String[] args) {
        System.out.println(foo(new int[] { 1, 2, 3, 4, 5 }, 3));
        System.out.println(foo(new int[] { 1, 2, 3, 4, 5 }, 6));
    }

    public static int foo(int[] arr, int minSize) {
        return arr.length < minSize ? -1 : arr.length;
    }
}