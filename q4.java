import java.util.Scanner;

public class q4{
    public static double min(double[] array) {
        double smallest = array[0]; 

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextDouble();
        }
        double minimum = min(numbers);
        System.out.println("The minimum number is: " + minimum);
        sc.close();
    }
}