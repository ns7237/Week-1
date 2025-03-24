import java.util.Scanner;
public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5]; 
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is a positive even number.");
                } else {
                    System.out.println(numbers[i] + " is a positive odd number.");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is a negative number.");
            } else {
                System.out.println(numbers[i] + " is zero.");
            }
        }
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        if (first == last) {
            System.out.println("First and last elements are equal.");
        } else if (first > last) {
            System.out.println("First element is greater than the last element.");
        } else {
            System.out.println("First element is less than the last element.");
        }
        sc.close();
    }
}
