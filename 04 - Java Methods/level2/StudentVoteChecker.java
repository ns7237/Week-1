import java.util.Scanner;
public class StudentVoteChecker {
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; 
        }
        return age >= 18; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10]; 
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }
        System.out.println("\nVoting Eligibility:");
        for (int i = 0; i < 10; i++) {
            boolean canVote = canStudentVote(studentAges[i]);
            if (studentAges[i] < 0) {
                System.out.println("Student " + (i + 1) + ": Invalid age entered!");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age " + studentAges[i] + "): Eligible to Vote");
            } else {
                System.out.println("Student " + (i + 1) + " (Age " + studentAges[i] + "): Not Eligible to Vote");
            }
        }
        scanner.close();
    }
}
