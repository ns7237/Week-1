import java.util.Random;
import java.util.Scanner;
public class VotingEligibility {
    public static int[] generateAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(82) + 10; 
        }
        return ages;
    }
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }
    public static void displayResults(String[][] data) {
        System.out.println("Age      | Voting Eligibility");
        System.out.println("-----------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "       | " + data[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        int[] ages = generateAges(numStudents);
        String[][] results = checkVotingEligibility(ages);
        displayResults(results);
        scanner.close();
    }
}
