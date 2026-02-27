
public class PallindromeCheckerApp {
    public static void main(String[] args) {

        // Hardcoded string
        String original = "madam";

        // Create a stack
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push all characters into the stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        // Pop characters to build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Compare original and reversed
        if (original.equals(reversed)) {
            System.out.println("The given string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The given string \"" + original + "\" is NOT a Palindrome.");
        }
    }




}
