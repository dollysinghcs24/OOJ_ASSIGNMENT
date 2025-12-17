/*
 Question:
 Given a sorted array of distinct integers and a target value,
 return the index if the target is found.
 If not, return the index where it would be inserted.

 Example:
 Input: nums = [1,3,5,6], target = 5
 Output: 2
*/

class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};
        int target = 2;

        int index = searchInsert(nums, target);

        System.out.println("Insert position: " + index);
    }
}
