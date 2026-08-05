class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int i=0;
      int j=1;
      int sum=nums[i];
      int min=Integer.MAX_VALUE;
      if(sum>=target){
        return 1;
      }
      while(j<nums.length){
        sum+=nums[j];
            while(sum>=target){
            min=Math.min(j-i+1,min);
            sum=sum-nums[i];
            i++;
            }
            j++;
      }  
      if(min<Integer.MAX_VALUE){
        return min;
      }
      else{
        return 0;
      }
    }
}