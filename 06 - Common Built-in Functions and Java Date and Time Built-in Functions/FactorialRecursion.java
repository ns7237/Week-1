import java.util.Scanner;
public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = getInput(scanner);
        long factorial = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);
        scanner.close();
    }
    public static int getInput(Scanner scanner) {
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}
