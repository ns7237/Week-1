import java.util.Scanner;
public class Numberchecker{
	public static int number(int n){
		if (n < 0){
			return -1;
		} else if ( n > 0){
			return 1;
		} else{
			return 0;
		}
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scanner.nextInt();
		int checker = number(n);
		System.out.println("Returns: " + checker);
		scanner.close();
	}
}