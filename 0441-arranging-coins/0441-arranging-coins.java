class Solution {
    public int arrangeCoins(int n) {
        long l=0;
        long h=n;
        long y=n;
        while(l<=h){
            long mid=l+(h-l)/2;
            long x=mid*(mid+1)/2;
            if(x==y){
                return (int)mid;
            } 
            else if(x<y){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        long z=h*(h+1)/2;
        if(z<y){
            return (int)h;
        }
        else{
            return (int)h-1;
        }
    }
}