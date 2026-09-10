public class Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i[] : accounts) {
            int total = 0;
            for (int j : i) {
                total += j;
            }
            if (total > max) {
                max = total;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int result = maximumWealth(accounts);
        System.out.print(result);
    }
}