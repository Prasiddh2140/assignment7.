import java.util.Scanner;

public class DecimalToOctal {

    // Method to convert decimal to octal
    public static String decimalToOctal(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        String octal = "";

        while (decimal > 0) {
            int remainder = decimal % 8;
            octal = remainder + octal;  // prepend
            decimal = decimal / 8;
        }

        return octal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        if (decimal < 0) {
            System.out.println("Negative numbers are not supported.");
            return;
        }

        String octal = decimalToOctal(decimal);

        System.out.println("Octal representation: " + octal);

        sc.close();
    }
}
