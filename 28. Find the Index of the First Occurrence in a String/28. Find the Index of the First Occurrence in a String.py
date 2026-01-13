class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        index = -1
        check_len = len(needle)
        for i in range(len(haystack)):
            if haystack[i:i+check_len] == needle:
                index = i
                return index
            else:
                continue
        return index
                
        