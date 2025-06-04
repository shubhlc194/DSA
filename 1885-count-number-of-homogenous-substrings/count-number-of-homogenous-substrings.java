class Solution {
    public int countHomogenous(String s) {
        int len = 0;
        int result = 0;
        int mod = 1_000_000_007;

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                len++;
            } else {
                len = 1;
            }
            result = (result + len) % mod; // To avoid overflow
        }

        return result;
    }
}
