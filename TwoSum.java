/*
 Question:
 Given an array of integers nums and an integer target,
 return the indices of the two numbers such that they add up to target.

 Example:
 nums = [2, 7, 11, 15], target = 9
 Output: [0, 1]
*/

class TwoSumBasic {

    // Function to find two indices whose sum equals target
    public static int[] twoSum(int[] nums, int target) {

        // Check every possible pair
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                // If sum matches target
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        // If no pair is found
        return new int[]{-1, -1};
    }

    // Main method
    public static void main(String[] args) {

        // Input array
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call function
        int[] result = twoSum(nums, target);

        // Print result
        System.out.println("Indices are:");
        System.out.println(result[0] + " " + result[1]);
    }
}
