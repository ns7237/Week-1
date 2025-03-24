import java.util.Scanner;
public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms: ");
        int terms = scanner.nextInt();
        generateFibonacci(terms);
        scanner.close();
    }
    public static void generateFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        int first = 0, second = 1;
        System.out.print("Fibonacci Sequence: " + first);
        for (int i = 1; i < n; i++) {
            System.out.print(", " + second);
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println(); 
    }
}
