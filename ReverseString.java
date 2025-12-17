/*
 Question:
 Given a string, reverse the string and print it.

 Example:
 Input: "hello"
 Output: "olleh"
*/

class ReverseString {

    // Function to reverse a string
    public static String reverseString(String s) {

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        // Swap characters
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

    // Main method
    pub
