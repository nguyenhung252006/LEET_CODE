class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != target) {
                if (nums[i] > target) {
                    return i;
                }
            }else return i;
        }
        return nums.length;
    }
}