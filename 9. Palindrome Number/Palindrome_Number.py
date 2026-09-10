class Solution:
    def isPalindrome(self, x: int) -> bool:
        a = str(x)
        b = "".join(reversed(a))
        if (a == b): return True
        else: return False