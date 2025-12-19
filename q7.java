import java.util.Scanner;

public class RotateArrayClockwise {

    // 1. Method to read 10 integers into the array
    public static void readArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // 2. Method to rotate array clockwise by one position
    public static void rotateClockwise(int[] arr) {
        int last = arr[arr.length - 1]; // store last element

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
    }

    // 3. Method to print the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = new int[10];

        readArray(arr);

        rotateClockwise(arr);

        System.out.println("Array after clockwise rotation:");
        printArray(arr);
    }
}
