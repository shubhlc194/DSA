class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int cnt=1;
        int n=nums.length;
        for(int i=nums.length-2;i>=0;i--){
         if(nums[i]!=nums[i+1]) cnt++;
         if(cnt==3) return nums[i];
        }
        return nums[n-1];

    }
}