class Solution {
    public int findMiddleIndex(int[] nums) {
        int prefix[]=new int[nums.length+1];
        prefix[0]=0;
        for(int i=0;i<nums.length;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        for(int i=1;i<prefix.length;i++){
            int l=prefix[i-1];
            int r=prefix[prefix.length-1]-prefix[i];
            if(l==r){
                return i-1;
            }
        }
        return -1;
    }
}