/*
 Question:
 Given an integer x, return true if x is a palindrome,
 and false otherwise.

 Example:
 Input: 121
 Output: true

 Input: -121
 Output: false
*/

class PalindromeNumber {

    // Function to check palindrome number
    public static boolean isPalindrome(int x) {

        // Negative numbers are not palindrome
        if (x < 0) {
            return false;
        }

        int original = x;
        int reverse = 0;

        // Reverse the number
        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }

        // Compare original and reversed number
        return original == reverse;
    }

    // Main method
    public static void main(String[] args) {

        int x = 121;

        boolean result = isPalindrome(x);

        System.out.println("Is Palindrome Number: " + result);
    }
}
