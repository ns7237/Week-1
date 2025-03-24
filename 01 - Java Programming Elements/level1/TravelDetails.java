import java.util.Scanner;
public class TravelDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter the city you are traveling from: ");
        String fromCity = sc.nextLine();
        System.out.print("Enter the city you are traveling via: ");
        String viaCity = sc.nextLine();
        System.out.print("Enter your final destination city: ");
        String toCity = sc.nextLine();
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = sc.nextDouble();
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = sc.nextDouble();
        System.out.print("Enter the total time taken for the journey (in hours): ");
        double timeTaken = sc.nextDouble();
        if (fromToVia < 0 || viaToFinalCity < 0 || timeTaken <= 0) {
            System.out.println("Error: Distances and time must be positive values.");
            return;  
        }
        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;
        System.out.printf("\nThe results of your travel details:\n");
        System.out.printf("Total distance: %.2f miles\n", totalDistance);
        System.out.printf("Time taken: %.2f hours\n", timeTaken);
        System.out.printf("Average speed: %.2f miles per hour\n", averageSpeed);
    }
}
