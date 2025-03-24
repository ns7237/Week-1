import java.util.Scanner;
public class SumUntilZeroorNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("Enter a number (enter 0 or negative number to stop): ");
            double userInput = sc.nextDouble();
            if (userInput <= 0) {
                break; 
            }
            total += userInput;
        }
        System.out.println("The total sum is: " + total);
        sc.close();
    }
}
