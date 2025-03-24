import java.util.Scanner;
public class CountDown2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start value: ");
        int counter = sc.nextInt();
        for (int i = counter; i >= 1; i--) {
            System.out.println("T-" + i);  
        }
        System.out.println("Launch!");
        sc.close();
    }
}
