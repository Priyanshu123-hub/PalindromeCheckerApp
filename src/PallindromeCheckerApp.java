
public class PallindromeCheckerApp {
    public static void main(String[] args) {

        String original = "madam";

        // Create a Queue (FIFO) and a Stack (LIFO)
        java.util.Queue<Character> queue = new java.util.LinkedList<>();
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Enqueue into queue and push into stack
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            queue.add(ch);   // enqueue
            stack.push(ch);  // push
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove(); // dequeue
            char fromStack = stack.pop();    // pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The given string \"" + original + "\" is a Palindrome (Queue + Stack check).");
        } else {
            System.out.println("The given string \"" + original + "\" is NOT a Palindrome (Queue + Stack check).");
        }
    }



}
