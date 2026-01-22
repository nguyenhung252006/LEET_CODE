/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    let count = 0;
    let num = NaN;
    for (let i of nums) {
        if (count == 0) num = i;
        i == num ? count ++ : count--
    }
    return num;
};