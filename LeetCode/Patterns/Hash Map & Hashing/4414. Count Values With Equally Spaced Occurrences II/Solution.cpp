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
        if(z.second.size()>=3){
            int val=z.second[1]-z.second[0];
            bool f=true;
            for(int i=1;i<z.second.size();i++){
                int temp=z.second[i]-z.second[i-1];
                if(temp!=val){
                    f=false;
                    break;
                }
            }
            if(f) cnt++;
        }
       }

       return cnt;

       return cnt;
    }
};