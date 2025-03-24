import java.util.Arrays;
public class NumberChecker{
	public static int countDigits(int num){
		return String.valueOf(num).length();
	}
	public static int[] getDigitsArray(int num){
		String str = String.valueOf(num);
		int[] digits = new int[str.length()];
		for (int i = 0; i < str.length(); i++){
			digits[i] = Character.getNumericValue(str.charAt(i));
		}
		return digits;
	}
	public static boolean isDuckNumber(int num){
		String str = String.valueOf(num);
		return str.contains("0") && str.charAt(0) != '0';
	}
	public static boolean isArmstrong(int num){
		int[] digits = getDigitsArray(num);
		int power = digits.length;
		int sum = 0;
		for (int digit : digits){
			sum += Math.pow(digit, power);
		}
		return sum == num;
	}
	public static void findLargestAndSecondLargest(int[] digits){
		int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
		for (int num : digits){
			if (num > largest){
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest){
				secondLargest = num;
			}
		}
		System.out.println("Largest: " + largest + ", Second Largest: " + secondLargest);
	}
	public static void findSmallestAndSecondSmallest(int[] digits){
		int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
		for (int num : digits){
			if(num < smallest){
				secondSmallest = smallest;
				smallest = num;
			} else if (num < secondSmallest && num != smallest){
				secondSmallest = num;
			}
		}
		System.out.println("Smallest: " + smallest + ", Second Smallest : " +secondSmallest);
	}
	public static void main(String[] args){
		int num = 153;
		System.out.println("Number: " + num);
		System.out.println("Count of digits: " + countDigits(num));
		int[] digits = getDigitsArray(num);
		System.out.println("Digits Array: " + Arrays.toString(digits));
		System.out.println("Is DuckNumber: " + isArmstrong(num));
		findLargestAndSecondLargest(digits);
		findSmallestAndSecondSmallest(digits);
	}
}