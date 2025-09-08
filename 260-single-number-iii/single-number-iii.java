import java.util.*;

class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Collect numbers that appear only once
        int[] result = new int[2];
        int index = 0;

        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                result[index++] = key; 
            }
        }

        return result; // return the two unique numbers
    }
}
