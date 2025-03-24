public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        handleException();
    }
    public static void generateException() {
        String text = null;  
        System.out.println(text.length());  
    }
    public static void handleException() {
        String text = null; 
        try {
            System.out.println(text.length());  
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: Cannot call method on a null object.");
        }
    }
}
