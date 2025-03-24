import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();
        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmis = new double[n];
        String[] statuses = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();
            System.out.print("Enter height (m) of person " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            if (bmis[i] <= 18.4)
                statuses[i] = "Underweight";
            else if (bmis[i] <= 24.9)
                statuses[i] = "Normal";
            else if (bmis[i] <= 39.9)
                statuses[i] = "Overweight";
            else
                statuses[i] = "Obese";
        }
        System.out.println("\nPerson\tWeight (kg)\tHeight (m)\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n", (i + 1), weights[i], heights[i], bmis[i], statuses[i]);
        }
        sc.close();
    }
}
