public class PallindromeCheckerApp {
    public static void main(String[] args) {

        String original = "madam";

        // Convert string to character array
        char[] characters = original.toCharArray();

        int left = 0;
        int right = characters.length - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (left < right) {
            if (characters[left] != characters[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The given string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The given string \"" + original + "\" is NOT a Palindrome.");
        }
    }



}
