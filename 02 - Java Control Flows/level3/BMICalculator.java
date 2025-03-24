import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();    
        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble() / 100; 
        double bmi = weight / (height * height);
        String status = bmi <= 18.4 ? "Underweight" : 
                        bmi <= 24.9 ? "Normal" : 
                        bmi <= 39.9 ? "Overweight" : "Obese";
        System.out.printf("BMI: %.2f\nStatus: %s\n", bmi, status);
        sc.close();
    }
}
