import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0, originalNumber = number;
        while (originalNumber != 0) {
            sum += originalNumber % 10; 
            originalNumber /= 10; 
        }
        System.out.println(number + (number % sum == 0 ? " is a Harshad Number" : " is not a Harshad Number"));
        sc.close();
    }
}
