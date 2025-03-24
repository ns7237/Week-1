import java.util.Arrays;
public class NumberChecker3 {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }
    public static int[] getDigitsArray(int num) {
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = Character.getNumericValue(str.charAt(i));
        }
        return digits;
    }
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
    public static boolean isPalindrome(int num) {
        int[] digits = getDigitsArray(num);
        int[] reversed = reverseDigitsArray(digits);
        return areArraysEqual(digits, reversed);
    }
    public static boolean isDuckNumber(int num) {
        String str = String.valueOf(num);
        return str.contains("0") && str.charAt(0) != '0';
    }
    public static void main(String[] args) {
        int num = 1221;
        System.out.println("Number: " + num);
        System.out.println("Count of Digits: " + countDigits(num));

        int[] digits = getDigitsArray(num);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        int[] reversed = reverseDigitsArray(digits);
        System.out.println("Reversed Digits Array: " + Arrays.toString(reversed));

        System.out.println("Are Original and Reversed Arrays Equal: " + areArraysEqual(digits, reversed));
        System.out.println("Is Palindrome: " + isPalindrome(num));
        System.out.println("Is Duck Number: " + isDuckNumber(num));
    }
}
