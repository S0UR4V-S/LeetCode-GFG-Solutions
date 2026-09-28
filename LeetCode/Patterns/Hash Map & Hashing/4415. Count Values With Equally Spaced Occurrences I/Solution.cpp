class Solution {
public:
    int countSpecialIntegers(vector<int>& nums) {
       int n=nums.size();
       map<int,vector<int>>ma;

       for(int i=0;i<n;i++){
        ma[nums[i]].push_back(i);
       } 

       int cnt=0;

       for(auto z:ma){
        if(z.second.size()==3){
            int val1=z.second[0];
            int val2=z.second[1];
            int val3=z.second[2];

            if(val1-val2==val2-val3) cnt++;
        }
       }

       return cnt;
    }
};