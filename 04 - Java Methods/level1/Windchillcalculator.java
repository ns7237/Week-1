import java.util.Scanner;
public class Windchillcalculator {
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + (0.6215 * temperature) + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature (in Fahrenheit): ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter wind speed (in mph): ");
        double windSpeed = scanner.nextDouble();
        scanner.close();
        if (windSpeed < 3) {
            System.out.println("Wind chill calculation is not valid for wind speeds below 3 mph.");
            return;
        }
        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.println("Wind Chill Temperature: " + windChill + "°F");
    }
}
