class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            if(e.getValue()>1)
                return true;
        }
        return false;

    }
}