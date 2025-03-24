import java.util.Arrays;
public class NumberChecker4 {
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
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static boolean isNeonNumber(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }
    public static boolean isSpyNumber(int num) {
        int[] digits = getDigitsArray(num);
        int sum = 0, product = 1;
        for (int digit : digits) {
            sum += digit;
            product *= digit;
        }
        return sum == product;
    }
    public static boolean isAutomorphicNumber(int num) {
        int square = num * num;
        return String.valueOf(square).endsWith(String.valueOf(num));
    }
    public static boolean isBuzzNumber(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }
    public static void main(String[] args) {
        int num = 7;
        System.out.println("Number: " + num);
        System.out.println("Is Prime: " + isPrime(num));
        System.out.println("Is Neon Number: " + isNeonNumber(num));
        System.out.println("Is Spy Number: " + isSpyNumber(num));
        System.out.println("Is Automorphic Number: " + isAutomorphicNumber(num));
        System.out.println("Is Buzz Number: " + isBuzzNumber(num));
    }
}
