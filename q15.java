import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] result = new int[10];
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 1: count zeros
        int zeroCount = 0;
        for (int value : arr) {
            if (value == 0) {
                zeroCount++;
            }
        }

        // Step 2: place non-zero elements after zeros
        int index = zeroCount;
        for (int value : arr) {
            if (value != 0) {
                result[index] = value;
                index++;
            }
        }

        System.out.println("After moving all zeros to the beginning:");
        for (int value : result) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}