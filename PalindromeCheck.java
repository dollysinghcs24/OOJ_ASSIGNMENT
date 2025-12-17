/*
 Question:
 Given a string s, determine if it is a palindrome.
 Consider only alphanumeric characters and ignore cases.

 Example:
 Input: "A man, a plan, a canal: Panama"
 Output: true
*/

class ValidPalindrome {

    // Function to check palindrome
    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            char c1 = s.charAt(left);
            char c2 = s.charAt(right);

            // Skip non-alphanumeric characters from left
            if (!isAlphaNumeric(c1)) {
                left++;
                continue;
            }

            // Skip non-alphanumeric characters from right
            if (!isAlphaNumeric(c2)) {
                right--;
                continue;
            }

            // Convert both to lowercase (manual)
            if (toLower(c1) != toLower(c2)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // Check if character is alphanumeric
    public static boolean isAlphaNumeric(char c) {
        if (c >= 'a' && c <= 'z') return true;
        if (c >= 'A' && c <= 'Z') return true;
        if (c >= '0' && c <= '9') return true;
        return false;
    }

    // Convert uppercase to lowercase
    public static char toLower(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char)(c + 32);
        }
        return c;
    }

    // Main method
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        boolean result = isPalindrome(s
