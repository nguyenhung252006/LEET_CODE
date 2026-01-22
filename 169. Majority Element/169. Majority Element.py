# class Solution:
#     def majorityElement(self, nums: List[int]) -> int:
#         check = len(nums) / 2
#         arr = {}
#         result = 0
#         for i in nums:
#             if i not in arr:
#                 arr[i] = 1
#             else:
#                 arr[i] += 1
#         for i in arr:
#             if arr[i] > check:
#                 result = i
#                 break
#         return result
    
    
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        count = 0
        number = None
        for num in nums:
            if count == 0:
                number = num
            count += 1 if num == number else -1
        return number
