import java.util.Scanner;
public class PalindromeChecker {
    public static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end)
            return true;
        if (text.charAt(start) != text.charAt(end))
            return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }
    public static boolean isPalindromeUsingCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine().toLowerCase(); 
        boolean iterativeCheck = isPalindromeIterative(text);
        boolean recursiveCheck = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean charArrayCheck = isPalindromeUsingCharArray(text);
        System.out.println("Using Iterative Method: " + (iterativeCheck ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Recursive Method: " + (recursiveCheck ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Character Array Method: " + (charArrayCheck ? "Palindrome" : "Not a Palindrome"));
        scanner.close();
    }
}
