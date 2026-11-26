class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        else{
            int x=10;
            while(n-x>=0){
                n=n-x;
                x=x-1;
            }
            if(x%2==0){
                return false;
            }
            else{
                return true;
            }
        }
    }
}