/*
 Question:
 Given a string s, find the first non-repeating character in it
 and return its index. If it does not exist, return -1.

 Example:
 Input: "leetcode"
 Output: 0

 Input: "loveleetcode"
 Output: 2
*/

class FirstUniqueCharacter {

    // Function to find index of first unique character
    public static int firstUniqChar(String s) {

        int[] count = new int[256]; // ASCII character count

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 1) {
                return i;
            }
        }

        return -1;
    }

    // Main method
    public static void main(String[] args) {

        String s = "loveleetcode";

        int index = firstUniqChar(s);

        System.out.println("First unique character index: " + index);
    }
}
