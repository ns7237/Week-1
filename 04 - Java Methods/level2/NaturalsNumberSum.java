import java.util.Scanner;
public class NaturalsNumberSum {
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1; 
        }
        return n + sumUsingRecursion(n - 1); 
    }
    public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (n): ");
        int n = scanner.nextInt();
        scanner.close();
        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
            return;
        }
        int recursiveSum = sumUsingRecursion(n);
        int formulaSum = sumUsingFormula(n);
        System.out.println("Sum using Recursion: " + recursiveSum);
        System.out.println("Sum using Formula: " + formulaSum);
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the same correct result!");
        } else {
            System.out.println("There is a mismatch in results. Check your logic!");
        }
    }
}
