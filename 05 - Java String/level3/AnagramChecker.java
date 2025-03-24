import java.util.Scanner;
public class AnagramChecker {  
    static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }
        int[] frequency = new int[256]; 
        for (int i = 0; i < text1.length(); i++) {
            frequency[text1.charAt(i)]++;
            frequency[text2.charAt(i)]--;
        }
        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first text: ");
        String text1 = scanner.nextLine().replaceAll("\\s", "").toLowerCase();
        System.out.print("Enter second text: ");
        String text2 = scanner.nextLine().replaceAll("\\s", "").toLowerCase();
        if (areAnagrams(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
        scanner.close();
    }
}
