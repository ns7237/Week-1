import java.util.Random;
import java.util.Scanner;
public class StudentScorecard {
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(41) + 60; 
            scores[i][1] = random.nextInt(41) + 60;
            scores[i][2] = random.nextInt(41) + 60;
        }
        return scores;
    }
    public static double[][] calculateStats(int[][] scores) {
        int numStudents = scores.length;
        double[][] stats = new double[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = Math.round((total / 3.0) * 100.0) / 100.0;

            stats[i][0] = total;
            stats[i][1] = average;
            stats[i][2] = percentage;
        }
        return stats;
    }
    public static String[] assignGrades(double[][] stats) {
        int numStudents = stats.length;
        String[] grades = new String[numStudents];
        for (int i = 0; i < numStudents; i++) {
            double percentage = stats[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }
    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("\nStudent Scorecard:");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Student | Physics | Chemistry | Math | Total | Avg  | %   | Grade");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                (i + 1) + "       | " + scores[i][0] + "      | " + scores[i][1] + "       | " + scores[i][2] +
                "   | " + (int)stats[i][0] + "   | " + Math.round(stats[i][1]) + "  | " + stats[i][2] + " | " + grades[i]
            );
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        int[][] scores = generateScores(numStudents);
        double[][] stats = calculateStats(scores);
        String[] grades = assignGrades(stats);
        displayScorecard(scores, stats, grades);
        scanner.close();
    }
}
