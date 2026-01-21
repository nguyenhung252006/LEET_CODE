class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        a = [None] * 28
        j = 1
        for i in alpha:
            a[j] = i
            j += 1
        if len(columnTitle) == 1:
            return a.index(columnTitle)
        else:
            out = 0
            for x in columnTitle:
                out = out * 26 + a.index(x)
            return out
            