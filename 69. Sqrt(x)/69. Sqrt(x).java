
class Solution {

    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        long l = 1;
        long r = x / 2;
        while (l <= r) {
            long m = (l + r) / 2;
            if (m * m == x) {
                return (int) Math.floor(m);
            } else if (m * m < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return (int) Math.floor(r);
    }
}
