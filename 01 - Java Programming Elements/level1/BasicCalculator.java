import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double number2 = sc.nextDouble();
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        String division = (number2 != 0) ? String.valueOf(number1 / number2) : "undefined (cannot divide by zero)";
        System.out.println("The addition, subtraction, multiplication, and division value of " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
        sc.close();
    }
}
