import java.util.Arrays;
public class NumberChecker2 {
	public static int countDigits(int num){
		return String.valueOf(num).length();
	}
	public static int[] getDigitsArray(int num){
		String str = String.valueOf(num);
		int[] digits = new int[str.length()];
		for( int i = 0; i < str.length(); i++){
			digits[i] = Character.getNumericValue(str.charAt(i));
		}
		return digits;
	}
	public static int sumOfDigits(int[] digits){
		int sum = 0;
		for(int digit : digits){
			sum += digit;
		}
		return sum;
	}
	public static int sumOfSquaresOfDigits(int[] digits){
		int sum = 0;
		for (int digit : digits){
			sum += Math.pow(digit, 2);
		}
		return sum;
	}
	public static boolean isHarshadNumber(int num){
		int sum = sumOfDigits(getDigitsArray(num));
		return num % sum == 0;
	}
	public static int[][] findDigitFrequency(int[] digits){
		int[][] freq = new int[10][2];
		for(int i = 0; i < 10; i++){
			freq[i][0] = i;
		}
		return freq;
	}
	public static void main(String[] args){
		int num = 21;
		System.out.println("Number: " + num);
		System.out.println("COunt of Digits: " + countDigits(num));
		int[] digits = getDigitsArray(num);
		System.out.println("Digits Array: " + Arrays.toString(digits));
		System.out.println("Sum of Digits: " + sumOfDigits(digits));
		System.out.println("Sum of Squares of Digits: " + sumOfSquaresOfDigits(digits));
		System.out.println("Is Harshad Number: " + isHarshadNumber(num));
		int[][] freq = findDigitFrequency(digits);
		System.out.println("Digit Frequencies: ");
		for(int i = 0; i < 10; i++){
			if (freq[i][1] > 0){
				System.out.println("Digit: " + freq[i][0] + "Frequency: " + freq[i][1]);
			}
		}
	}
}
	