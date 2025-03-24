import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for Physics, Chemistry, and Maths: ");
        int physics = sc.nextInt(), chemistry = sc.nextInt(), maths = sc.nextInt();        
        double avg = (physics + chemistry + maths) / 3.0;
        String grade = avg >= 80 ? "A" : avg >= 70 ? "B" : avg >= 60 ? "C" : avg >= 50 ? "D" : avg >= 40 ? "E" : "R";       
        System.out.println("Average Marks: " + avg + "\nGrade: " + grade);
        sc.close();
    }
}
