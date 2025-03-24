import java.util.Scanner;
public class SpringSeason{
	public static boolean isSpringseason(int month, int day){
		return (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter month : ");
		int month = scanner.nextInt();
		System.out.print("ENter day : ");
        int day = scanner.nextInt();
        scanner.close();		
		if (isSpringseason(month, day)){
			System.out.println("it's a Spring Season");
		} else {
			System.out.println("Not a Spring Season");
		}
	}
}
	