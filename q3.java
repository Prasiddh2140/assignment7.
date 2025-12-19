import java.util.Scanner;

class q3 {

    // Method to read 10 integers into the array
    public static void readArray(int[] arr) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public static int countOccurrences(int[] arr, int key) {
        int count = 0;

        for (int value : arr) {
            if (value == key) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        readArray(arr);
        System.out.print("Enter the number to search: ");
        int key = sc.nextInt();
        int occurrences = countOccurrences(arr, key);
        if (occurrences > 0) {
            System.out.println(
                "The number " + key + " appears " + occurrences + " time(s) in the array."
            );
        } else {
            System.out.println(
                "The number " + key + " is not found in the array."
            );
        }
        sc.close();
    }
}