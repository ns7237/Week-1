import java.util.Scanner;
import java.util.Arrays;
public class StringsplitDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();
        String[] manualWords = splitTextManually(text);
        String[] builtInWords = text.split(" ");
        boolean areEqual = compareStringArrays(manualWords, builtInWords);
        System.out.println("\nOriginal Text: " + text);
        System.out.println("Manual Split Words: " + Arrays.toString(manualWords));
        System.out.println("Built-in Split Words: " + Arrays.toString(builtInWords));
        System.out.println("Are both methods equal? " + areEqual);
        scanner.close();
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
    public static String[] splitTextManually(String text) {
        int length = findStringLength(text);
        int wordCount = 1; 
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < spaceIndexes.length; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[wordCount - 1] = text.substring(start); // Last word

        return words;
    }
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
}
