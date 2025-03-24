import java.util.Scanner;
public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        System.out.print("Enter an index to access (0 to 4): ");
        int index = scanner.nextInt();
        generateException(names, index);
        handleException(names, index);
        scanner.close();
    }
    public static void generateException(String[] names, int index) {
        System.out.println("Accessing element: " + names[index]); 
    }
    public static void handleException(String[] names, int index) {
        try {
            System.out.println("Accessing element: " + names[index]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled Exception: Index " + index + " is out of bounds.");
        } catch (RuntimeException e) {
            System.out.println("Handled Generic Runtime Exception: " + e.getMessage());
        }
    }
}
