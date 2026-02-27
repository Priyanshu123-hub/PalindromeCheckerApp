public class PallindromeCheckerApp {


        public static void main(String[] args) {

            // Hardcoded string (String Literal)
            String word = "madam";

            // Reverse the string
            String reversed = new StringBuilder(word).reverse().toString();

            // Check palindrome using if-else
            if (word.equals(reversed)) {
                System.out.println("The given string \"" + word + "\" is a Palindrome.");
            } else {
                System.out.println("The given string \"" + word + "\" is NOT a Palindrome.");
            }

    }

}
