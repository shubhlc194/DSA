class Solution {
    public int[] sortArray(int[] nums) {
         HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // TreeMap to sort the keys of HashMap
        TreeMap<Integer, Integer> sortedMap = new TreeMap<>(freqMap);

        // Build the sorted array
        int index = 0;
        int[] sortedArray = new int[nums.length];
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            int key = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                sortedArray[index++] = key;
            }
        }

        return sortedArray;
    }
}