import java.util.Scanner;
public class FindFactorsUsingWhile {
    public static void main(String[] args) {       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int i = 1;
            System.out.println("Factors of " + number + " are:");
            while (i <= number) {
                if (number % i == 0) {  
                    System.out.println(i);
                }
                i++;  
            }
        }
        sc.close();
    }
}
