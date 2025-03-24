import java.util.Scanner;
public class HeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = scanner.nextDouble();
        double heightInInches = heightInCm / 2.54;
        int feet = (int) heightInInches / 12;
        int inches = (int) heightInInches % 12;
        System.out.println("Your height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + inches);
        scanner.close();
    }
}
