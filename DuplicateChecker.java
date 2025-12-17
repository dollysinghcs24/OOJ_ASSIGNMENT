/*
 Question:
 Given an integer array nums,
 return true if any value appears at least twice.
 Return false if every element is distinct.

 Example:
 Input: nums = [1,2,3,1]
 Output: true
*/

class ContainsDuplicate {

    // Function to check duplicates
    public static boolean containsDuplicate(int[] nums) {

        // Compare every pair
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    // Main method
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        boolean result = containsDuplicate(nums);

        System.out.println("Contains Duplicate: " + result);
    }
}
