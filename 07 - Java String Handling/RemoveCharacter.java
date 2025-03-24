public class RemoveCharacter {
    public static void main(String[] args) {
        String str = "Hello World";
        char charToRemove = 'l';       
        String modifiedStr = removeCharacter(str, charToRemove);
        System.out.println("Modified String: \"" + modifiedStr + "\"");
    }
    public static String removeCharacter(String str, char charToRemove) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != charToRemove) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
