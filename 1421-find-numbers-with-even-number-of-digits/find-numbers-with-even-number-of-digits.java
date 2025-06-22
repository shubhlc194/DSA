class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int cnt = 0; // reset cnt for each number
            int n = nums[i];
            while (n != 0) {
                n = n / 10;
                cnt++;
            }
            if (cnt % 2 == 0) {
                ans++;
            }
        }
        
        return ans;
    }
}
