/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    var result = {};
    for (var i = 0; i < nums.length ; i++) {
        var b = target - nums[i];
        if (b in result) {
            return [result [b], i];
        }else {
            result[nums[i]] = i;
        }
    }
};