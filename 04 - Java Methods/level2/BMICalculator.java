import java.util.Scanner;
public class BMICalculator {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; 
            data[i][2] = weight / (heightInMeters * heightInMeters); 
        }
    }
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3]; 
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.println("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }
        calculateBMI(data);
        System.out.println("\nWeight (kg) | Height (cm) | BMI | Status");
        System.out.println("----------------------------------------");
        for (int i = 0; i < 10; i++) {
            double bmi = data[i][2];
            String status = getBMIStatus(bmi);
            System.out.printf("%.2f kg     | %.2f cm    | %.2f | %s%n", data[i][0], data[i][1], bmi, status);
        }
        scanner.close();
    }
}
