class Solution {
    public int missingNumber(int[] nums) {
        int x=0;
        int y=0;
        int z=0;
        for(int i=0;i<nums.length;i++){
             x^=i+1;
             y^=nums[i];
        }
        return x^y;
    }
}