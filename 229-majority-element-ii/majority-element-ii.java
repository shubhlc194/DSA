class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int num:nums){
            mpp.put(num,mpp.getOrDefault(num,0)+1);
        }
             List<Integer> result = new ArrayList<>();
             for(int key:mpp.keySet()){
            if(mpp.get(key)>n/3){
                result.add(key);
            
             }
        }
        return result;
    }
}