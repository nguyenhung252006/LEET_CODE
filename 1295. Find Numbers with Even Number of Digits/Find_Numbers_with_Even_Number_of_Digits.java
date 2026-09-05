class Find_Numbers_with_Even_Number_of_Digits {


    public static int findLenNumber (int nums) {
        int k = nums / 10;
        int len = 1;
        while (k != 0 ) {
            len ++;
            k = k / 10;
        }
        return len;
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            int len =findLenNumber(i);
            if (len % 2==0) {
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
       int[] nums = {12,345,2,6,7896};
       System.out.print(findNumbers(nums));
    }

}