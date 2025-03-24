import java.util.Scanner;
public class CalendarDisplay {
    static String[] months = { "January", "February", "March", "April", "May", "June", 
                               "July", "August", "September", "October", "November", "December" };
    static int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    static int getFirstDayOfMonth(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m0) / 12) % 7;  
    }
    static void printCalendar(int month, int year) {
        System.out.println("\n  " + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        if (month == 2 && isLeapYear(year)) {
            daysInMonth[1] = 29;
        } else {
            daysInMonth[1] = 28; 
        }
        int firstDay = getFirstDayOfMonth(month, year);
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= daysInMonth[month - 1]; day++) {
            System.out.printf("%3d ", day); 
            if ((day + firstDay) % 7 == 0) { 
                System.out.println();
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.close();
        if (month < 1 || month > 12 || year < 1) {
            System.out.println("Invalid input! Please enter a valid month and year.");
        } else {
            printCalendar(month, year);
        }
    }
}
