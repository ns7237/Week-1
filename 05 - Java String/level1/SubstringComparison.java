import java.util.Scanner;
public class SubstringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String str = scanner.next();     
        System.out.print("Enter the start index: ");
        int start = scanner.nextInt();      
        System.out.print("Enter the end index: ");
        int end = scanner.nextInt();
        String charAtSubstring = createSubstringUsingCharAt(str, start, end);
        String builtInSubstring = str.substring(start, end);
        boolean areEqual = compareUsingCharAt(charAtSubstring, builtInSubstring);
        System.out.println("Substring using charAt(): " + charAtSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Are both substrings equal? " + areEqual);
        scanner.close();
    }
    public static String createSubstringUsingCharAt(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += s.charAt(i); 
        }
        return result;
    }
    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false; 
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true; 
    }
}
