public class Sort_an_Array {

    public static int[] mergeSort(int[] nums, int left, int right) {
        if (left > right) {
            int[] rs = new int[0];
            return rs;
        }
        if (left == right) {
            int[] rs = { nums[left] };
            return rs;
        }
        int k = (left + right) / 2;
        int[] a1 = mergeSort(nums, left, k);
        int[] a2 = mergeSort(nums, k + 1, right);
        int i = 0;
        int i1 = 0;
        int i2 = 0;
        int[] result = new int[a1.length + a2.length];
        while (i < a1.length + a2.length) {
            if (i1 < a1.length && i2 < a2.length) {
                if (a1[i1] < a2[i2]) {
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            } else {
                if (i1 < a1.length) {
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            }
        }
        return result;
    }

    public static int[] sortArray(int[] nums) {

        return mergeSort(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] nums = { 5, 3, 2, 1 };
        int[] rs = sortArray(nums);
        for (int i : rs) {
            System.out.print(i + " ");
        }
    }
}
