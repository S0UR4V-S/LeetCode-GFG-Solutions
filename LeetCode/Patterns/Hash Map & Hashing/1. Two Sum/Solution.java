class Solution {
    public int[] twoSum(int[] nums, int target) {
        int f=0;
        int s=0;
        int i=0;
        int j=0;
        for(i=0;i<nums.length;i++){
            for(j=i;j<nums.length;j++){
                    if(nums[i]+nums[j]==target && i!=j){
                        f=i;
                        s=j;
                        break;
                        }
            }
        }
        int[]arr ={f,s};  
        return arr;
    }
}