class Solution {
    public int smallestNumber(int n, int t) {
        int c=n;
        int pro=m1(n);
        if(pro%t==0){
            return c;
        }
        else{
            while(pro%t!=0){
                n=n+1;
                pro=m1(n);
            }
            return n;
        }
    }
    static public int m1(int n){
        int p=1;
         while(n!=0){
            if(n==0) return 0;
            int d=n%10;
            p*=d;
            n=n/10;
        }
        return p;
    }
}