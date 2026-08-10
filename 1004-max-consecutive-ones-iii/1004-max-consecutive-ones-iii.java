class Solution {
    public int longestOnes(int[] nums, int k) {
       int i=0;
        int j=0;
        int max=0;
        int c=0;
        while(j<nums.length){
            if(nums[j]==0){
                c++;
            }
            while(c>k && i<nums.length){
                int x=nums[i];
                if(x==0){
                    c--;
                }
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}