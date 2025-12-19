import java.util.Scanner;

public class BubbleSortDemo {

    // Bubble sort method
    public static void bubbleSort(double[] arr) {
        int n = arr.length;

        for (int pass = 0; pass < n - 1; pass++) {
            for (int i = 0; i < n - 1 - pass; i++) {
                if (arr[i] > arr[i + 1]) {
                    // swap
                    double temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    // Method to print array
    public static void printArray(double[] arr) {
        for (double value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];

        System.out.println("Enter 10 double numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }

        bubbleSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);

        sc.close();
    }
}
