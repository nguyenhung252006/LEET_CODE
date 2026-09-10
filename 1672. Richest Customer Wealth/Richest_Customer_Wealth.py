class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        return max(sum(customer) for customer in accounts)

accounts = [[1,5],[7,3],[3,5]]
print(Solution().maximumWealth(accounts))

# nếu sử dụng các hàm của py thì việc compile code sẽ có vẻ nhanh hơn