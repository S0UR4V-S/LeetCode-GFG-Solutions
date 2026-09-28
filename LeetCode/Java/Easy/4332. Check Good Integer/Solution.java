class Solution {
    public boolean checkGoodInteger(int n) {
        int digit=0;
        int square=0;
        while(n>0){
            digit+=n%10;
            square+=(n%10)*(n%10);
            n/=10;
        }
        if(square-digit>=50)
            return true;
        else 
        return false;
    }
}