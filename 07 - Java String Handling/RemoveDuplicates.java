import java.util.Scanner;
public class RemoveDuplicates {
    static String removeDuplicates(String str) {
        boolean[] seen = new boolean[256];
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (!seen[ch]) { 
                result.append(ch);
                seen[ch] = true;
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        String modifiedString = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + modifiedString);
    }
}
