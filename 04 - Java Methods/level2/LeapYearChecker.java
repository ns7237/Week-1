import java.util.Scanner;
public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false; 
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();
        scanner.close();
        if (year < 1582) {
            System.out.println("The program only works for years 1582 and later.");
        } else if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }
}
