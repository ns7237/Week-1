import java.util.Random;
import java.util.Scanner;
public class StudentScorecard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        int[][] scores = generateScores(numStudents);
        double[][] computedScores = calculateScores(scores);
        displayScorecard(scores, computedScores);
        scanner.close();
    }
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; 

        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = random.nextInt(41) + 60; 
            }
        }
        return scores;
    }
    public static double[][] calculateScores(int[][] scores) {
        double[][] computed = new double[scores.length][3]; 
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            computed[i][0] = total;
            computed[i][1] = Math.round(average * 100.0) / 100.0; 
            computed[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return computed;
    }
    public static void displayScorecard(int[][] scores, double[][] computedScores) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] +
                    "\t" + (int) computedScores[i][0] + "\t" + computedScores[i][1] + "\t" + computedScores[i][2] + "%");
        }
    }
}
