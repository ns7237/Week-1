import java.util.Scanner;
public class ToggleCase{
	static String toggleCase(String str){
		StringBuilder result = new StringBuilder();
		for(char ch: str.toCharArray()){
			if(Character.isUpperCase(ch)){
				result.append(Character.isUpperCase(ch));
			} else if (Character.isLowerCase(ch)){
				result.append(Character.toUpperCase(ch));
			} else{
				result.append(ch);
			}
		}
		return result.toString();
	}
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		scanner.close();
		String toggledString = toggleCase(input);
		System.out.println("Toggled case string: " + toggledString);
	}
}