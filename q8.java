import java.util.Random;

public class PrimeCounter {

    // 1. Fill array with random values between 2 and 30
    public static void fillArray(int[] arr) {
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(29) + 2; // 2 to 30
        }
    }

    // 2. Print array elements
    public static void printArray(int[] arr) {
        System.out.print("Array elements: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 3. Check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 4. Count prime numbers in the array
    public static int countPrimes(int[] arr) {
        int count = 0;

        for (int value : arr) {
            if (isPrime(value)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = new int[10];

        fillArray(arr);
        printArray(arr);

        int primeCount = countPrimes(arr);

        System.out.println("Number of prime numbers in the array: " + primeCount);
    }
}
