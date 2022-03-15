/**
Input: [2,7,11,15], 9
Output: [0,1]
**/
class TwoSum {
    // Brute force
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - 1; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] {
                        i,
                        j
                    };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    // Time complexity: O(n^2)
    // Space complexity: O(1)
}