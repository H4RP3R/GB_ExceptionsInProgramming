import java.util.Scanner;

public class UI {
    public int[] getInputArray(Scanner iScanner) {
        System.out.print("Enter array length: ");
        int arrLength = iScanner.nextInt();

        int[] userArray = new int[arrLength];
        System.out.println("Fill in the array number by number");
        for (int i = 0; i < arrLength; i++) {
            userArray[i] = iScanner.nextInt();
        }

        return userArray;
    }

    public int getItemForSearch(Scanner iScanner) {
        System.out.print("Enter a number: ");
        return iScanner.nextInt();
    }

    public void processResult(int result) {
        switch (result) {
            case -1:
                System.out.println("Array length is less than is required");
                break;
            case -2:
                System.out.println("Can't find the item");
                break;
            case -3:
                System.out.println("The array is null");
                break;
            default:
                System.out.printf("Index=%d\n", result);
                break;
        }
    }
}