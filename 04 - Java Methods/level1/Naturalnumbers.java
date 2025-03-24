import java.util.Scanner;
public class Naturalnumbers{
	public static int calculatenaturals(int n){
		return ((n * (n + 1)) / 2);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int n = sc.nextInt();
		int result = calculatenaturals(n);
		System.out.println("Result: " + result);
		sc.close();
	}
}