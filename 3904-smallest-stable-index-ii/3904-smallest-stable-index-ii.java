class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] pm=new int[n];
        int min=Integer.MAX_VALUE;
        int max=nums[0];
        for(int i=n-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            pm[i]=min;
        }
        for(int j=0;j<n;j++){
            max=Math.max(max,nums[j]);
            int y=Math.abs(max-pm[j]);
            if(y<=k){
                return j;
            }
        }
        return -1;
    }
}