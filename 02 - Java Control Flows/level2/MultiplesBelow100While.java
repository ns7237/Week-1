import java.util.Scanner;
public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            int counter = number;
            System.out.println("Multiples of " + number + " below 100 are:");         
            while (counter < 100) {
                System.out.println(counter);  
                counter += number;  
            }
        }
        sc.close();
    }
}
