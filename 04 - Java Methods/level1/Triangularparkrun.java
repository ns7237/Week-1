import java.util.Scanner;
public class Triangularparkrun{
	public static int calculaterounds(double side1, double side2, double side3){
		double perimeter = side1 + side2 + side3;
		return (int) Math.ceil(5000 / perimeter);
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the sides: ");
		double side1 = scanner.nextDouble(), side2 = scanner.nextDouble(), side3 = scanner.nextDouble();
		int rounds = calculaterounds(side1, side2, side3);
		System.out.println("the athlete must complete " + rounds + " rounds to finish a 5km run.");
		scanner.close();
	}
} 
		