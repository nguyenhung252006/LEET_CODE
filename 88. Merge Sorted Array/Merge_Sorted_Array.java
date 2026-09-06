public class Merge_Sorted_Array {
    
     static void mergeFunction (int x, int[] nums1,int m) {
        boolean isChange = false;
        for (int i = 0; i < m; i++) {
            if (nums1[i] > x) {
                isChange = true;
                for (int k = m-1; k >= i; k--) {
                   nums1[k+1] = nums1[k];
                }
                nums1[i] = x;
                break;
            }
        }  
        if (isChange == false) {
                nums1[m] = x;
            }
    }

        static  void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int a : nums2) {
            mergeFunction(a,nums1,m);
            m++;
        }
        for (int x : nums1) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
    }

}
