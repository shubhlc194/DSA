class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer>mpp=new HashMap<>();
        int sum=0;
        int count=0;
        mpp.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int green = ((sum % k) + k) % k;
         if(mpp.containsKey(green)){
            count+=mpp.get(green);
         }
         mpp.put(green,mpp.getOrDefault(green,0)+1);

        }
        return count;
    }
}