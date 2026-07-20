class Solution {
    public int hammingDistance(int x, int y) {
        int z=x^y;
        int b=0;
        while((z|0)!=0){
            if((z&1)==1){
                b++;
            }
            z=z>>1;
        }
        return b;
    }
}