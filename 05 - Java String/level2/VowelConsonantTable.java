import java.util.Scanner;
public class VowelConsonantTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        String[][] charAnalysis = analyzeCharacters(text);
        displayCharacterTable(charAnalysis);
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
    public static String[][] analyzeCharacters(String text) {
        int length = findStringLength(text);
        String[][] result = new String[length][2];
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch); 
            result[i][1] = checkCharacterType(ch); 
        }
        return result;
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
    public static void displayCharacterTable(String[][] data) {
        System.out.println("\nCharacter Analysis:");
        for (String[] row : data) {
            System.out.println(row[0] + " - " + row[1]);
        }
    }
}
