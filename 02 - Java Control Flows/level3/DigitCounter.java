import java.util.Scanner;
public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int count = 0, originalNumber = number;       
        do {
            count++;
            number /= 10; // Remove last digit
        } while (number != 0);
        
        System.out.println("Number of digits in " + originalNumber + " is: " + count);
        sc.close();
    }
}
