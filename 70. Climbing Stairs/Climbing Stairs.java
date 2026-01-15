
class Solution {

    public int climbStairs(int n) {

        if (n <= 2) return n;

        int list[] = new int[n + 1];
        list[1] = 1;
        list[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            list[i] = list[i - 1] + list[i - 2];
        }
        return list[n];
    }
}
