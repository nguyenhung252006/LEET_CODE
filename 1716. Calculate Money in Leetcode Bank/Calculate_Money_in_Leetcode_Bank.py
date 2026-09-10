class Solution(object):
    def totalMoney(self, n):
        """
        :type n: int
        :rtype: int
        """
        weeks = n // 7
        days = n % 7
        total = 0

        # Tổng tiền của các tuần đầy đủ
        # Tuần 1: 1+2+...+7 = 28
        # Tuần 2: (2+3+...+8) = 28 + 7 = 35
        # => công thức: 28*weeks + 7*(weeks*(weeks-1)//2)
        total += 28 * weeks + 7 * (weeks * (weeks - 1) // 2)

        # Tiền của tuần cuối (chưa đủ 7 ngày)
        start_day = weeks + 1
        for i in range(days):
            total += start_day + i

        return total


s = Solution()
print(s.totalMoney(10)) 
