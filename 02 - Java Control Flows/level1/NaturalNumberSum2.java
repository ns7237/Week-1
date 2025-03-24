import java.util.Scanner;
public class NaturalNumberSum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
            sc.close();
            return;  
        }
        int formulaSum = (n * (n + 1)) / 2;
        int loopSum = 0;
        for (int i = 1; i <= n; i++) {
            loopSum += i; 
        }
        System.out.println("Sum using the formula (n*(n+1)/2): " + formulaSum);
        System.out.println("Sum using the for loop: " + loopSum);
        if (formulaSum == loopSum) {
            System.out.println("The results match! Both computations are correct.");
        } else {
            System.out.println("There is an error in the calculations.");
        }
        sc.close();
    }
}

