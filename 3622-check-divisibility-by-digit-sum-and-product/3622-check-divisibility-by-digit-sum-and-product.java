class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int p=1;
        int x=n;
        while(x>0){
            int d=x%10;
            sum+=d;
            p*=d;
            x=x/10;
        }
        sum+=p;
        if(n%sum==0){
            return true;
        }
        return false;
    }
}