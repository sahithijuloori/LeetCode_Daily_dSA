class Solution {
    public int longestSubsequence(int[] nums) {
        int c=0;
        int x=0;
        for(int i=0;i<nums.length;i++){
            int b=nums[i];
            x=x^b;
            if(b!=0){
                c++;
            }
        }
        if(x!=0){
            return nums.length;
        }
        else{
            if(c>0){
                return nums.length-1;
            }
            else{
                return 0;
            }
        }
    }
}