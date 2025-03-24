import java.util.Scanner;
public class Digitfrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        scanner.close();
        String numStr = Long.toString(Math.abs(number)); 
        int length = numStr.length();
        int[] digits = new int[length];
        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        int[] frequency = new int[10];
        for (int i = 0; i < length; i++) {
            frequency[digits[i]]++;
        }
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}
