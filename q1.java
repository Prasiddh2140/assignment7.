import java.util.Scanner;
import java.util.Random;

class q1 {

    // Method to calculate sum of array elements
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    // Method to calculate average of array elements
    public static double findAverage(int[] arr) {
        int sum = findSum(arr); 
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        int[] arr = new int[n];

        System.out.print("Random values stored in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(50); // random values between 0 and 49
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int sum = findSum(arr);
        double average = findAverage(arr);

        System.out.println("Sum of elements = " + sum);
        System.out.println("Average of elements = " + average);

        sc.close();
    }
}