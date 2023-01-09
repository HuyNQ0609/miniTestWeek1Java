import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr;
        System.out.print("Enter a size: ");
        int size = input.nextInt();
        arr = new int[size];
        System.out.println("Enter values of elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "] : ");
            arr[i] = input.nextInt();
        }
        System.out.println("The newly created array has the form: " + Arrays.toString(arr));
        System.out.println("\nTotal of elements on array: " + sumArray(arr));
        System.out.println("Max value on array: " + maxArray(arr));
    }
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        return sum;
    }
    public static int maxArray(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }
}