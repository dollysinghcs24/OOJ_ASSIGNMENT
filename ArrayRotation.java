/*
 Question:
 Given an integer array nums, rotate the array to the right by k steps.

 Example:
 Input: nums = [1,2,3,4,5,6,7], k = 3
 Output: [5,6,7,1,2,3,4]
*/

class RotateArray {

    // Function to rotate array
    public static void rotate(int[] nums, int k) {
        int n = nums.length;

        // In case k is greater than array length
        k = k % n;

        // Temporary array
        int[] temp = new int[n];

        // Copy last k elements to beginning
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        // Copy remaining elements
        for (int i = k; i < n; i++) {
            temp[i] = nums[i - k];
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }

    // Main method
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(nums, k);

        System.out.print("Rotated Array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
