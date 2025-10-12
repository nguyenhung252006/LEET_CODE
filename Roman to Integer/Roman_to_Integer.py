class Solution:
    def romanToInt(self, s: str) -> int:   
        arr = {
            "I" : 1,
            "V" : 5,
            "X" : 10,
            "L" : 50,
            "C" : 100,
            "D" : 500,
            "M" : 1000,
        }
        count = 0
        prev = 0
        for i in range(len(s) - 1, -1, -1): 
            curr = arr[s[i]]
            if curr < prev:
                count -= curr
            else:
                count += curr
                prev = curr
        return count
    
