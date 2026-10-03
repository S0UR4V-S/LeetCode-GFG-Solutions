class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            if(e.getValue()>1)
                ans=e.getKey();
        }
        return ans;
    }
}