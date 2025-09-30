import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> result = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int b = target - nums[i];
            if (result.containsKey(b)) {
               return new int[] {result.get(b),i};
            }else{
                result.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}