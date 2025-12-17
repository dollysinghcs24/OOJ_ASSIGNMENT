/*
 Question:
 Given two integer arrays nums1 and nums2,
 return their intersection.
 Each element in the result must be unique.

 Example:
 Input: nums1 = [1,2,2,1], nums2 = [2,2]
 Output: [2]
*/

class IntersectionOfArrays {

    // Function to find intersection
    public static int[] intersection(int[] nums1, int[] nums2) {

        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int count = 0;

        // Find common elements
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {

                    // Check if already added
                    boolean exists = false;
                    for (int k = 0; k < count; k++) {
                        if (temp[k] == nums1[i]) {
                            exists = true;
                            break;
                        }
                    }

                    if (!exists) {
                        temp[count] = nums1[i];
                        count++;
                    }
                }
            }
        }

        // Create result array of exact size
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = intersection(nums1, nums2);

        System.out.print("Intersection: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
