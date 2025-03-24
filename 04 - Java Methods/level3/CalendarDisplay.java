import java.util.Scanner;
public class CalendarDisplay {
    static String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    static int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }  
    public static int getFirstDayOfMonth(int year, int month) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m0) / 12) % 7;
    }    
    public static void displayCalendar(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            daysInMonth[2] = 29;
        }      
        System.out.println("\n " + months[month] + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        
        int firstDay = getFirstDayOfMonth(year, month);
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }        
        for (int day = 1; day <= daysInMonth[month]; day++) {
            System.out.printf("%4d", day);
            if ((firstDay + day) % 7 == 0) {
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
        displayCalendar(month, year);
        scanner.close();
    }
}
