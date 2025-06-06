import java.util.Scanner;
public class Trigonometrycalculator {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); 
        double sine = Math.sin(radians);  
        double cosine = Math.cos(radians); 
        double tangent = Math.tan(radians); 
        return new double[]{sine, cosine, tangent}; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();
        scanner.close();
        double[] result = calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);
    }
}
