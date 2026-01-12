class Solution {
    public int totalMoney(int n) {
        int week = n / 7;
        int days = n % 7;
        int total = 0;

        total += 28 * week + 7 * (week * (week - 1) / 2);

        int startDay = week + 1;
        
        for (int i = 0; i < days; i++) {
            total += startDay + i;
        }
        return total;
    }
}