class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int sum=nums[i]+nums[j];
            res=Math.max(res,sum);
            i++;
            j--;
        }
        return res;
    }
}