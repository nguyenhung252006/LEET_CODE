class Solution:
    def addBinary(self, a: str, b: str) -> str:
        i = len(a) - 1
        j = len(b) - 1
        sodu = 0
        ketqua=[]
        while i >= 0 or j >= 0 or sodu:
            tong = sodu
            if i>= 0:
                tong += int(a[i])
                i -= 1
            if j>= 0:
                tong += int(b[j])
                j -= 1
            ketqua.append(str(tong % 2))
            sodu = tong // 2
        return "".join(reversed(ketqua))
        
a = "11"
b = '1'
s=Solution()
print(s.addBinary(a = a,b = b))