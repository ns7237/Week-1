import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter marks for Student " + i + " (Physics, Chemistry, Maths):");
            int p = scanner.nextInt(), c = scanner.nextInt(), m = scanner.nextInt();          
            double percentage = (p + c + m) / 3.0;
            char grade = (percentage >= 80) ? 'A' : (percentage >= 70) ? 'B' : 
                         (percentage >= 60) ? 'C' : (percentage >= 50) ? 'D' : 
                         (percentage >= 40) ? 'E' : 'R';
            System.out.println("Percentage: " + percentage + "%, Grade: " + grade + "\n");
        }
        scanner.close();
    }
}
