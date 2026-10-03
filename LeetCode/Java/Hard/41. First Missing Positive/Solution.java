class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int n=nums.length;
        int max=-1000000000;
        for(int i=0;i<n;i++){
            if(max<nums[i])
            max=nums[i];
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        if(max<1)
            return 1;
        


        for(int i=1;i<max;i++){
            if(hm.containsKey(i)){}
            else
                return i;
        }

        return max+1;
    }
}