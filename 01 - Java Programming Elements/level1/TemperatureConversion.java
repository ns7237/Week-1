import java.util.Scanner;
public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid numeric value for Fahrenheit.");
            return;  
        }       
        double fahrenheit = sc.nextDouble();
        double celsiusResult = (fahrenheit - 32) * 5 / 9;
        System.out.printf("The temperature %.2f Fahrenheit is %.2f Celsius.\n", fahrenheit, celsiusResult);
    }
}
