/*
 Question:
 Given a sorted integer array nums,
 remove the duplicates in-place such that each unique element appears only once.

 Return the number of unique elements (k).

 Example:
 Input: nums = [1,1,2]
 Output: k = 2
 Modified array: [1,2,_]
*/

class RemoveDuplicates {

    // Function to remove duplicates
    public static int removeDuplicates(int[] nums) {

        // If array is empty
        if (nums.length == 0) {
            return 0;
        }

        int k = 1; // index for unique elements

        // Traverse from second element
        for (int i = 1; i < nums.length; i++) {

            // If current element is different from previous
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    // Main method
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3};

        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
