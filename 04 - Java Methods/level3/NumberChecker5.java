import java.util.Arrays;
public class NumberChecker5 {
    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }
    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 2]; // Second last element (excluding number itself)
    }
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
    public static boolean isPerfectNumber(int num) {
        int sum = sumOfFactors(findFactors(num)) - num;
        return sum == num;
    }
    public static boolean isAbundantNumber(int num) {
        int sum = sumOfFactors(findFactors(num)) - num;
        return sum > num;
    }
    public static boolean isDeficientNumber(int num) {
        int sum = sumOfFactors(findFactors(num)) - num;
        return sum < num;
    }
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    public static boolean isStrongNumber(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == num;
    }
    public static void main(String[] args) {
        int num = 28;
        System.out.println("Number: " + num);
        int[] factors = findFactors(num);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));
        System.out.println("Is Perfect Number: " + isPerfectNumber(num));
        System.out.println("Is Abundant Number: " + isAbundantNumber(num));
        System.out.println("Is Deficient Number: " + isDeficientNumber(num));
        System.out.println("Is Strong Number: " + isStrongNumber(num));
    }
}