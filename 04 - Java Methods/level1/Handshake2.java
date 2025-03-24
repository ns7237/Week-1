import java.util.Scanner;
public class Handshake2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n = scanner.nextInt();
		if (n < 2){
			System.out.println("Handshakes are not possible with less than 2 students.");
		} else{
			int Handshakes = (n * (n - 1)) / 2;
			System.out.println("No.of Handshakes are " + Handshakes);
		}
	}
}