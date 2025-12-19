import java.util.Scanner;

public class EliminateDuplicates {

    // Method to eliminate duplicates
    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];
        int size = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < size; j++) {
                if (list[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[size] = list[i];
                size++;
            }
        }

        // Create result array with exact size
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] distinct = eliminateDuplicates(arr);

        System.out.print("The distinct numbers are: ");
        for (int value : distinct) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}
