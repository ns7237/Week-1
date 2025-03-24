import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();
        LocalDate date = LocalDate.parse(inputDate, formatter);
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2); 
        LocalDate finalDate = modifiedDate.minusWeeks(3); 
        System.out.println("Original Date: " + date.format(formatter));
        System.out.println("After Adding 7 days, 1 month, 2 years: " + modifiedDate.format(formatter));
        System.out.println("After Subtracting 3 weeks: " + finalDate.format(formatter));
        scanner.close();
    }
}
