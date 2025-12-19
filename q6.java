import java.util.Scanner;

public class ArrayAnalysis {

    // 1. Read values into array
    public static void readArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // 2. Find maximum value
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // 3. Find minimum value
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    // 4. Count occurrences of a value
    public static int countOccurrences(int[] arr, int value) {
        int count = 0;
        for (int v : arr) {
            if (v == value) {
                count++;
            }
        }
        return count;
    }

    // 5. First position of maximum value (1-based)
    public static int firstPositionOfMax(int[] arr, int max) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                return i + 1;
            }
        }
        return -1; // should never happen
    }

    // 6. Last position of minimum value (1-based)
    public static int lastPositionOfMin(int[] arr, int min) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == min) {
                return i + 1;
            }
        }
        return -1; // should never happen
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size.");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " values:");
        readArray(arr);

        int max = findMax(arr);
        int min = findMin(arr);

        int maxCount = countOccurrences(arr, max);
        int minCount = countOccurrences(arr, min);

        int firstMaxPos = firstPositionOfMax(arr, max);
        int lastMinPos = lastPositionOfMin(arr, min);

        System.out.println("Maximum value: " + max);
        System.out.println("It occurs " + maxCount + " time(s)");
        System.out.println("First position of maximum: " + firstMaxPos);

        System.out.println("Minimum value: " + min);
        System.out.println("It occurs " + minCount + " time(s)");
        System.out.println("Last position of minimum: " + lastMinPos);

        sc.close();
    }
}
