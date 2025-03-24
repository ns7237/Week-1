public class ReplaceWord {
    public static void main(String[] args) {
        String sentence = "Java is a powerful programming language.";
        String wordToReplace = "powerful";
        String newWord = "versatile";
        String modifiedSentence = replaceWord(sentence, wordToReplace, newWord);
        System.out.println("Modified Sentence: " + modifiedSentence);
    }
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }
}
