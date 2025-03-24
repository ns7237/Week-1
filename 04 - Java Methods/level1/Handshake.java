import java.util.Scanner;
public class Handshake{
	public static int handshakecalculator( int n){
		return (n * (n - 1)) / 2;
	}
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the no.of students : ");
		int n = scanner.nextInt();
		if (n < 2) {
			System.out.println("Handshakes are not possible with less than 2 students.");
		} else {
			int hc = handshakecalculator(n);
		    System.out.println("No.of Handshakes are " + hc);
		}
		scanner.close();
	}
}
		