class Solution {

    public String check (int i, int j, String s) {
        String result = "";
        int l = i;
        int r = j;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l -= 1;
            r += 1;
        }
        result=s.substring(l + 1,r);
        return result;
    }

    public String longestPalindrome(String s) {
        String out = "";
        for (int i = 0; i < s.length() ; i++) {
            String prev = check(i, i, s);
            String after = check(i, i + 1, s);
            if (prev.length() > out.length()) {
                out = prev;
            }
            if (after.length() > out.length()) {
                out = after;
            }
        }
        return out;
    }
}
