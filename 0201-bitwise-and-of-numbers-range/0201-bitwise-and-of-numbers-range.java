class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int ans=0;
        int c=0;
        while(left!=right){
            left=left>>1;
            right=right>>1;
            c++;
        }
        ans=ans|left;
        ans=ans<<c;
        return ans;
    }
}