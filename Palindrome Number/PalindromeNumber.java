class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        char array[] = str.toCharArray();
        String a[] = new String[array.length];
        for (int i = 0, j = array.length - 1; i < array.length && j >= 0; i++, j--) {
            a[i] = String.valueOf(array[j]);
        }
        String reverse = String.join("",a);
        if (!reverse.equals(String.valueOf(x)))  return false;
        return true;
    }
}