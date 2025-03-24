import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first double value: ");
        double firstValue = scanner.nextDouble();
        System.out.print("Enter the second double value: ");
        double secondValue = scanner.nextDouble();
        double addition = firstValue + secondValue;
        double subtraction = firstValue - secondValue;
        double multiplication = firstValue * secondValue;
        double division = 0;
        if (secondValue != 0) {
            division = firstValue / secondValue;
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        System.out.println("Addition: " + firstValue + " + " + secondValue + " = " + addition);
        System.out.println("Subtraction: " + firstValue + " - " + secondValue + " = " + subtraction);
        System.out.println("Multiplication: " + firstValue + " * " + secondValue + " = " + multiplication);
        if (secondValue != 0) {
            System.out.println("Division: " + firstValue + " / " + secondValue + " = " + division);
        }
        scanner.close();
    }
}
