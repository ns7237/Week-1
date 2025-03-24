import java.util.Scanner;
public class StringIndexOutOfBoundsDemo{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String text = scanner.next();
		try{
			generateException(text);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Caught Exception: " + e.getMessage());
		}
		handleException(text);
		scanner.close();
	}
	public static void generateException(String text){
		System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
	}
	public static void handleException(String text){
		try{
			System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
		} catch (StringIndexOutOfBoundsException e){
			System.out.println("Handled StringIndexOutOfBoundsException: Index is out of range.");
		}
	}
}