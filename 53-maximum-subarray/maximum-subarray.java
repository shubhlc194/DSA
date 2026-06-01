class Solution {
    public int maxSubArray(int[] nums) {
        int bestind=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=bestind+nums[i];
            int v2=nums[i];
        bestind=Math.max(v1,v2);
        ans=Math.max(ans,bestind);
        }
        return ans;
    }
}