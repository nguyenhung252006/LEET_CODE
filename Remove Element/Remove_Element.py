class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        index = 0
        check_len = len(nums)
        while (index < check_len):
            if nums[index] == val:
                del nums[index]
                check_len = len(nums)
            else:
                index+=1
        return len(nums)
                

s=Solution()
print(s.removeElement([0,1,2,2,3,0,4,2],2))