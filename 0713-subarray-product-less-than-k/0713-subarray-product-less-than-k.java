class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int c=0;
        int l=0;
        int r=0;
        int x=1;
        if(k<=1){
            return 0;
        }
        for(r=0;r<nums.length;r++){
            x=x*nums[r];
            while(x>=k){
                x/=nums[l];
                l++;
            }
            c+=r-l+1;
        }
        return c;
    }
}