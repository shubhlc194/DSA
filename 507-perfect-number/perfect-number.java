class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false; // no perfect number is <= 1
        
        int ans = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                ans += i;
            }
        }
        return ans == num;
    }
}
