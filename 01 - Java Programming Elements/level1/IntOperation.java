import java.util.Scanner;
public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();
        System.out.print("Enter value for b: ");
        int b = sc.nextInt();
        System.out.print("Enter value for c: ");
        int c = sc.nextInt();
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;
        System.out.println("The results of the integer operations are:");
        System.out.println("1. a + b * c = " + result1);
        System.out.println("2. a * b + c = " + result2);
        System.out.println("3. c + a / b = " + result3);
        System.out.println("4. a % b + c = " + result4);
        sc.close();
    }
}
