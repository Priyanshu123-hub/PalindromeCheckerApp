
public class PallindromeCheckerApp {
    public static void main(String[] args) {

        String original = "madam";

        // Create a Deque
        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

        // Insert all characters into the deque
        for (int i = 0; i < original.length(); i++) {
            deque.addLast(original.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear until deque is empty or mismatch found
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The given string \"" + original + "\" is a Palindrome (Deque check).");
        } else {
            System.out.println("The given string \"" + original + "\" is NOT a Palindrome (Deque check).");
        }
    }



}
