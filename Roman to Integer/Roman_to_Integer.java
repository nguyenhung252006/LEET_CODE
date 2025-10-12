import java.util.*;
class Solution {
    public int romanToInt(String s) {
        char a[] = s.toCharArray();
        Map<Character, Integer> map = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );
        int count = 0;
        int prev = 0;
        for (int i = a.length - 1 ; i >= 0; i-- ){
            int curr = map.get(a[i]);
            if (curr < prev) {
                count -= curr;
            }else {
                count += curr;
                prev = curr;
            } 
        }
        return count;
    }
}