import math

class Solution:
    def mySqrt(self, x: int) -> int:
        if x < 2:
            return math.floor(x)
        left, right = 1, x//2
        while left <= right:
            mid = (left + right) // 2
            if mid * mid == x:
                return math.floor(mid)
            elif mid * mid < x:
                left = mid + 1
            else:
                right = mid - 1
        return math.floor(right)
                