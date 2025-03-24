import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 length (in meters): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 length (in meters): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 length (in meters): ");
        double side3 = sc.nextDouble();
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Error: Side lengths must be positive values.");
            return; 
        }
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000;
        double rounds = totalDistance / perimeter;
        System.out.printf("The total number of rounds the athlete will run is %.2f%n", rounds);
    }
}
