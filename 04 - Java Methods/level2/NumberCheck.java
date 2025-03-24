import java.util.Scanner;
public class NumberCheck {
    public static boolean isPositive(int num) {
        return num >= 0;
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("\nNumber Analysis:");
        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.print(num + " is Positive and ");
                if (isEven(num)) {
                    System.out.println("Even.");
                } else {
                    System.out.println("Odd.");
                }
            } else {
                System.out.println(num + " is Negative.");
            }
        }
        int result = compare(numbers[0], numbers[4]);
        System.out.print("\nComparison of first and last element: ");
        if (result == 1) {
            System.out.println(numbers[0] + " is greater than " + numbers[4]);
        } else if (result == -1) {
            System.out.println(numbers[0] + " is less than " + numbers[4]);
        } else {
            System.out.println(numbers[0] + " is equal to " + numbers[4]);
        }
        scanner.close();
    }
}
