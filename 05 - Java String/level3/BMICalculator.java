import java.util.Scanner;
public class BMICalculator {
    public static String[][] computeBMI(double[][] data) {
        String[][] bmiData = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100.0; 
            double bmi = weight / (height * height); 
            String status = getBMIStatus(bmi);
            bmiData[i][0] = String.valueOf(data[i][1]); 
            bmiData[i][1] = String.valueOf(weight); 
            bmiData[i][2] = String.format("%.2f", bmi); 
            bmiData[i][3] = status; 
        }
        return bmiData;
    }
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi >= 18.5 && bmi < 25) return "Normal";
        else if (bmi >= 25 && bmi < 30) return "Overweight";
        else return "Obese";
    }
    public static void displayBMIData(String[][] bmiData) {
        System.out.println("\nBMI Report:");
        System.out.println("-----------------------------------------");
        System.out.println("Height (cm) | Weight (kg) | BMI  | Status");
        System.out.println("-----------------------------------------");
        for (String[] row : bmiData) {
            System.out.println(row[0] + "         | " + row[1] + "        | " + row[2] + "  | " + row[3]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2];
        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " Weight (kg): ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Person " + (i + 1) + " Height (cm): ");
            data[i][1] = scanner.nextDouble();
        }
        String[][] bmiData = computeBMI(data);
        displayBMIData(bmiData);
        scanner.close();
    }
}
