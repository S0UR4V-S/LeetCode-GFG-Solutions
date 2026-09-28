class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            ans.put(nums[i],(ans.getOrDefault(nums[i],0)+1));
            // ans[nums[i]]++;
        }
        int n=nums.length;
        n/=2;
        int result=-1;
        for(Map.Entry<Integer, Integer> e : ans.entrySet()){
            if(e.getValue()>n){
                return e.getKey();
            }
        }
        return -1;
    }
}