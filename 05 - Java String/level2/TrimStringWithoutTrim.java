import java.util.Scanner;
public class TrimStringWithoutTrim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String text = scanner.nextLine();
        int[] trimIndices = findTrimIndices(text);
        String trimmedText = substringUsingCharAt(text, trimIndices[0], trimIndices[1]);
        String builtInTrimmedText = text.trim();
        boolean isSame = compareStrings(trimmedText, builtInTrimmedText);
        System.out.println("\nTrimmed using charAt(): '" + trimmedText + "'");
        System.out.println("Trimmed using trim():   '" + builtInTrimmedText + "'");
        System.out.println("Both results are same: " + isSame);
        scanner.close();
    }
    public static int[] findTrimIndices(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }
    public static String substringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
