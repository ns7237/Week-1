import java.util.Scanner;
public class FootballTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;
        System.out.println("Enter the heights of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = sc.nextDouble();
            sum += heights[i]; 
        }
        double meanHeight = sum / heights.length;
        System.out.println("The mean height of the football team is: " + meanHeight);
        sc.close();
    }
}
