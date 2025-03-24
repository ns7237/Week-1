import java.util.Scanner;
public class PowerUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();       
        System.out.print("Enter the power (positive integer): ");
        int power = sc.nextInt();
        if (number <= 0 || power < 0) {
            System.out.println("Please enter a positive base number and a non-negative power.");
        } else {
            int result = 1;
            int counter = 0;
            while (counter < power) {
                result *= number;  
                counter++;  
            }
            System.out.println(number + " raised to the power of " + power + " is: " + result);
        }
        sc.close();
    }
}
