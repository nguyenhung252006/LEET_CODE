class Solution {

        static int sodu = 0;    
        static boolean check(int a) {
            if(a == 1) return true;
            return false;
        }

    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuffer sb = new StringBuffer(); 
        while ( i >= 0 || j >= 0 || check(sodu)) {
            int tong = sodu;
            if (i >= 0) {
                tong += a.charAt(i) - '0';
                i --;
            }
            if (j >= 0) {
                tong += b.charAt(j) - '0';
                j--;
            }
            sb.append(tong%2);
            sodu = tong / 2;
        }
        return sb.reverse().toString();
    }
}