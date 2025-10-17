/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    for (var i = 0; i < nums.length; i++) {
        if (nums[i] != target) {
            if (nums[i] > target) return i;
        }else return i
    }return nums.length;
};