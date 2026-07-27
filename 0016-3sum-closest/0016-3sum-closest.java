class Solution {
    public int threeSumClosest(int[] nums, int target) {
      Arrays.sort(nums);
      int min=Integer.MAX_VALUE;
      int ans=0;
      for(int i=0;i<nums.length-2;i++){
        int x=nums[i];
        int j=i+1;
        int k=nums.length-1;
        while(j<k){
            int y=nums[j]+nums[k]+x;
            int z=Math.abs(target-y);
            if(y==target){
                return target;
            }
            else if(y<target){
                j++;
            }
            else{
                k--;
            }
            if(z<min){
                min=z;
                ans=y;
            }
         }
      }
      return ans;
    }
}