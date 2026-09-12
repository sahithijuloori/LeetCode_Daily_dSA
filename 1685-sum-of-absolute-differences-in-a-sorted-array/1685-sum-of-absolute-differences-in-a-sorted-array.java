class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
       int[] res=new int[nums.length];
       int n=nums.length;
       int ls=0;
       int rs=0;
       int sum=0;
       for(int i=0;i<n;i++){
        rs+=nums[i];
       } 
       for(int j=0;j<n;j++){
        rs=rs-nums[j];
        int b=(j)*(nums[j]);
        int c=(n-j-1)*(nums[j]);
        int x=Math.abs(b-ls);
        int y=Math.abs(c-rs);
        sum=x+y;
        ls+=nums[j];
        res[j]=sum;
       }
       return res;
    }
}