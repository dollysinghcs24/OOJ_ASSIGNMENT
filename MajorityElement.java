/*
 Question:
 Given an integer array nums of size n,
 return the majority element.
 The majority element appears more than n/2 times.

 Example:
 Input: nums = [3,2,3]
 Output: 3
*/

class MajorityElement {

    // Function to find majority element
    public static int majorityElement(int[] nums) {

        int n = nums.length;

        // Check count of each element
        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            // If count is greater than n/2
            if (count > n / 2) {
                return nums[i];
            }
        }

        return -1; // will not happen as majority always exists
    }

    // Main method
    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int result = majorityElement(nums);

        System.out.println("Majority Element: " + result);
    }
}
