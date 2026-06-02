class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int bestend = nums[0];
        int minend = nums[0];
        int ans = nums[0]; 
        int minans = nums[0];
        int totans = Math.abs(nums[0]);
        for(int i = 1; i < nums.length; i++){
            int v1 = nums[i];
            int v2 = bestend + nums[i];
            int v3 = minend + nums[i];   // ← minend ka apna sum

            bestend = Math.max(v1, v2);
            minend = Math.min(v1, v3);   // ← v2 nahi, v3 use karo

            ans = Math.max(ans, bestend);
            minans = Math.min(minans, minend);
            totans = Math.max(totans, Math.max(ans, Math.abs(minans)));
        }
        return totans;
    }
}