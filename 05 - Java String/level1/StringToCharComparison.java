import java.util.Scanner;
public class StringToCharComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();
        char[] userDefinedChars = getCharacters(str);
        char[] builtInChars = str.toCharArray();
        boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);
        System.out.println("Characters using user-defined method: " + new String(userDefinedChars));
        System.out.println("Characters using toCharArray() method: " + new String(builtInChars));
        System.out.println("Are both arrays equal? " + areEqual);
        scanner.close();
    }
    public static char[] getCharacters(String s) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i] = s.charAt(i); 
        }
        return result;
    }
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false; 
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false; 
            }
        }
        return true; 
    }
}
