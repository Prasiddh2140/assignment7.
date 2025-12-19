import java.util.Scanner;

public class MaximumValue {

    // Method to find the maximum element in the array
    public static double max(double[] array) {
        double largest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextDouble();
        }

        double maximum = max(numbers);

        System.out.println("The maximum number is: " + maximum);

        sc.close();
    }
}
