class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        result = {}
        for i in range(len(nums)):
            b = target - nums[i]
            if b in result:
                return [result[b], i]
            else:
                result[nums[i]] = i