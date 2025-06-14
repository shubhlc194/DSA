class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        
        if (n == 0) {
            return result;
        }

        result[0] = 0; // binary of 0 has 0 ones

        for (int i = 0; i <= n; i++) {
            result[i] = Integer.bitCount(i);
        }

        return result;
    }
}
