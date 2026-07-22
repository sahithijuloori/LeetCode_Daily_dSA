class Solution {
    public int reverseBits(int n) {
        int result=0;
        for(int i=0;i<32;i++){
            int x=0;
            if(((n>>i)&1)==1){
                 x=x|1;
            }
            x=(x<<31-i);
            result=result|x;
        }
        return result;
    }
}