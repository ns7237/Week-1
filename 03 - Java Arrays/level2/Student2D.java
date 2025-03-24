import java.util.Scanner;
public class Student2D{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n = scanner.nextInt();
		int[][] marks = new int[n][3];
		for (int i = 0; i < n; i++){
			System.out.println("Enter marks for student " + (i + 1) + " (physics, chemistry, maths):");
			for (int j = 0; j < 3; j++){
				marks[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < n; i++){
			double percentage = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
			char grade = (percentage >= 80) ? 'A' : (percentage >= 70) ? 'B' :
                         (percentage >= 60) ? 'C' : (percentage >= 50) ? 'D' :
                         (percentage >= 40) ? 'E' : 'R';
			System.out.println("Student " + (i + 1) + ": Percentage = " + percentage + "%, Grade = " + grade);
		}
		scanner.close();
	}
}