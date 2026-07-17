class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int k=nums.length-1;
        int arr[]=new int[nums.length];
        while(l<=r){
            int a=Math.abs(nums[l]);
            int b=Math.abs(nums[r]);
            if(b>a){
                arr[k]=b*b;
                r--;
                k--;
            }
            else{
                arr[k]=a*a;
                l++;
                k--;
            }
        }
        
        return arr;
    }
}