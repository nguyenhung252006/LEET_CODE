
class Solution {

    public int strStr(String haystack, String needle) {
        int index = -1;
        int checkLength = needle.length();
        for (int i = 0; i < haystack.length(); i++) {
            if (i + checkLength > haystack.length()) return index;
            if (haystack.substring(i, i + checkLength).equals(needle)) {
                index = i;
                return index;
            }
            else {
                continue;
            }
        }
        return index;
    }
}
