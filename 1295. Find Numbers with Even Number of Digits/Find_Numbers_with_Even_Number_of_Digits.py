class Solution(object):

    def findLen(self,nums):
        k = nums // 10
        len = 1
        while k != 0:
            len += 1
            k = k // 10
        return len

    def findNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = 0
        for i in nums:
            if self.findLen(i) % 2 == 0:
                count += 1
        return count


nums = [12,345,2,6,7896]
print(Solution().findNumbers(nums))