import java.util.Scanner;
public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        int[] counts = countVowelsAndConsonants(text);
        System.out.println("\nTotal Vowels: " + counts[0]);
        System.out.println("Total Consonants: " + counts[1]);
        scanner.close();
    }
    public static String checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); 
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;
        int length = findStringLength(text);
        for (int i = 0; i < length; i++) {
            String type = checkCharacterType(text.charAt(i));
            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }
    public static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); 
                count++; 
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }
}
