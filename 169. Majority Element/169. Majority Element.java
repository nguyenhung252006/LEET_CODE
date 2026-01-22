
// import java.util.HashMap;
// import java.util.Map;

// class Solution {

//     public int majorityElement(int[] nums) {
//         int number = 0;
//         int check = nums.length / 2;
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int i : nums) {
//             map.put(i, map.getOrDefault(i, 0) + 1);
//         }
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             if (entry.getValue() > check) {
//                 number = entry.getKey();
//             }
//         }
//         return number;
//     }
// }

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int num = 0;
        for (int i : nums) {
            if (count == 0) num = i;
            if (num == i) count++;
            else count--;
        }
        return num;
    }
}