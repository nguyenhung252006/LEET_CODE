public class First_Unique_Character_in_a_String {
    public static int firstUniqChar(String s) {
        int[] list = new int[26];
        for (int i = 0; i < s.length(); i++) {
            list[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (list[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "aabb";
        int results = firstUniqChar(s);
        System.out.print(results);
    }
}
