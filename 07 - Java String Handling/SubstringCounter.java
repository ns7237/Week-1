import java.util.Scanner;
public class SubstringCounter {
    static int countOccurrences(String str, String subStr) {
        int count = 0;
        int index = str.indexOf(subStr); 
        while (index != -1) { 
            count++;
            index = str.indexOf(subStr, index + 1); 
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the substring to find: ");
        String subStr = scanner.nextLine();
        scanner.close();
        int occurrences = countOccurrences(str, subStr);
        System.out.println("The substring occurs " + occurrences + " times.");
    }
}
