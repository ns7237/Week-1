import java.util.HashMap;
public class MostFrequentCharacter {
    public static void main(String[] args) {
        String str = "success";
        char mostFrequentChar = findMostFrequentCharacter(str);
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }
    public static char findMostFrequentCharacter(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        int maxCount = 0;
        char mostFrequentChar = '\0';
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = charCountMap.containsKey(ch) ? charCountMap.get(ch) + 1 : 1;
            charCountMap.put(ch, count);

            if (count > maxCount) {
                maxCount = count;
                mostFrequentChar = ch;
            }
        }
        return mostFrequentChar;
    }
}
