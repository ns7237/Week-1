import java.util.Scanner;
public class SI{
	public static int calculateSI (int p, int r, int t){
		return (p * r * t)/ 100;
	}
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the values: " );
		int p = scanner.nextInt(), r = scanner.nextInt(), t = scanner.nextInt();
        int SI = calculateSI(p, r, t);		
		System.out.println("The Simple Interest is " + SI + " for Principal " + p + ", " + "Rate of Interest " + r + " and Time " + t);
		scanner.close();
	}
}