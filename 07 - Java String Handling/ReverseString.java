import java.util.Scanner;
public class ReverseString {
    static String reverse(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            // Swap characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        String reversed = reverse(input);
        System.out.println("Reversed string: " + reversed);
    }
}
