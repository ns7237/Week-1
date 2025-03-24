import java.util.Scanner;
public class StringLengthFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();
        int manualLength = findStringLength(text);
        int builtInLength = text.length();
        System.out.println("\nOriginal Text: " + text);
        System.out.println("Manual Length Calculation: " + manualLength);
        System.out.println("Built-in Length Calculation: " + builtInLength);
        scanner.close();
    }
    public static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); 
                count++; 
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }
}
