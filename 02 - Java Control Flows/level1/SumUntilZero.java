import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double userInput;
        do {
            System.out.print("Enter a number (enter 0 to stop): ");
            userInput = sc.nextDouble();
            if (userInput != 0) {
                total += userInput;
            }
            
        } while (userInput != 0); 
        System.out.println("The total sum is: " + total);
        sc.close();
    }
}
