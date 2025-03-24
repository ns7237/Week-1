import java.util.Scanner;
public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String text = scanner.next();  
        generateException(text);
        handleException(text);
        scanner.close();
    }
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) { 
            System.out.println("Handled Exception: Invalid number format - " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Handled Generic Runtime Exception: " + e.getMessage());
        }
    }
}
