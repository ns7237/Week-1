import java.util.Scanner;
public class palindromeCheck{
	static boolean isPalindrome(String str){
		int left = 0, right = str.length() - 1;
		while (left < right){
			if(str.charAt(left) != str.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter a string: ");
		String input = scanner.nextLine().toLowerCase().replaceAll("\\s", "");
		scanner.close();
		if(isPlaindrome(input)){
			System.out.println("The string is a palindrome.");
		} else{
			System.out.println("The stringis not a palindrome.");
		}
	}
}
	