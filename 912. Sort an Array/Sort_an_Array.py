class Solution:

    def mergeSort(self, nums: List[int], left : int, right : int) -> list[int]:
        if (left > right):
            rs : list[int] = []
            return rs
        if (left == right):
            return [nums[left]]
        k : int = (left + right) // 2
        a1 : list[int] = self.mergeSort(nums, left, k)
        a2 : list[int] = self.mergeSort(nums, k + 1, right)
        result : list[int] = [0] * (len(a1) + len(a2))
        i = 0
        i1 = 0
        i2 = 0
        while (i < len(result)):
            if (i1 < len(a1) and i2 < len(a2)):
                if (a1[i1] < a2[i2]):
                    result[i] = a1[i1]
                    i+=1
                    i1+=1
                else:
                    result[i] = a2[i2]
                    i+=1
                    i2+=1
            else:
                if i1 < len(a1):
                    result[i] = a1[i1]
                    i+=1
                    i1+=1
                else:
                    result[i] = a2[i2]
                    i+=1
                    i2+=1
        return result
                



    def sortArray(self, nums: List[int]) -> List[int]:
       return self.mergeSort(nums, 0, len(nums) - 1)