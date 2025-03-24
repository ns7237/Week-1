import java.util.Scanner;
public class IllegalArgumentExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();
        handleException(text);
        scanner.close();
    }
    public static void generateException(String text) {
        int start = 5, end = 2;
        if (start > end) {
            throw new IllegalArgumentException("Start index cannot be greater than end index.");
        }
        System.out.println("Substring: " + text.substring(start, end));
    }
    public static void handleException(String text) {
        int start = 5, end = 2;
        try {
            if (start > end) {
                throw new IllegalArgumentException("Start index cannot be greater than end index.");
            }
            System.out.println("Substring: " + text.substring(start, end));
        } catch (IllegalArgumentException e) { 
            System.out.println("Handled Exception: " + e.getMessage());
        }
    }
}
