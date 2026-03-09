import java.util.LinkedList;

public class PallindromeCheckerApp {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        long startTime = System.nanoTime();

        boolean isPalindrome = true;
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        long endTime = System.nanoTime();

        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + (endTime - startTime) + " ns");
    }
}



