import java.util.*;

class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put(']', '[');
        mapping.put('}', '{');

        for  (char x : s.toCharArray()) {
            if (mapping.containsKey(x)) {
                // <điều_kiện> ? <giá_trị_nếu_đúng> : <giá_trị_nếu_sai>
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                if (topElement != mapping.get(x)) return false;
           }else stack.push(x);
        }return stack.isEmpty();
        // isEmpty kiểm tra xem List, Stack, Map có rỗng hay không
    }
}