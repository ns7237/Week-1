import java.util.Scanner;
public class WordLengthAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();
        String[] words = splitTextManually(text);
        String[][] wordLengthArray = getWordLengthArray(words);
        int[] minMax = findShortestAndLongest(wordLengthArray);
        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (String[] wordData : wordLengthArray) {
            System.out.printf("%s\t%d\n", wordData[0], Integer.parseInt(wordData[1]));
        }
        System.out.println("\nShortest word: " + wordLengthArray[minMax[0]][0] + " (Length: " + wordLengthArray[minMax[0]][1] + ")");
        System.out.println("Longest word: " + wordLengthArray[minMax[1]][0] + " (Length: " + wordLengthArray[minMax[1]][1] + ")");
        scanner.close();
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
        words[wordCount - 1] = text.substring(start); 

        return words;
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
    public static String[][] getWordLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i]; 
            wordLengthArray[i][1] = String.valueOf(findStringLength(words[i])); 
        }
        return wordLengthArray;
    }
    public static int[] findShortestAndLongest(String[][] wordLengthArray) {
        int minIndex = 0, maxIndex = 0;
        int minLength = Integer.parseInt(wordLengthArray[0][1]);
        int maxLength = minLength;
        for (int i = 1; i < wordLengthArray.length; i++) {
            int length = Integer.parseInt(wordLengthArray[i][1]);
            if (length < minLength) {
                minLength = length;
                minIndex = i;
            }
            if (length > maxLength) {
                maxLength = length;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }
}
