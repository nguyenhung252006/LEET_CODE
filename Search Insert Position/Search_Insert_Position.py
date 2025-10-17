class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        for i in range(0, len(nums),1):
            if (target != nums[i]):
                if nums[i] > target:
                    return i
            else:
                return i
        return len(nums)
            
