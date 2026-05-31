class Solution {
    public int findDuplicate(int[] nums) {
        int hasharr[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            hasharr[nums[i]]++;
        }
         for(int i=0;i<hasharr.length;i++){
        if(hasharr[i]>=2) return i;
         }
         return -1;
    }
}