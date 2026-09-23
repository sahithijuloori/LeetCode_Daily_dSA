class Solution {
    public int minOperations(int[] nums, int x) {
        int ts=0;
        for(int i=0;i<nums.length;i++){
            ts+=nums[i];
        }
        int y=0;
        if(ts<x){
            return -1;
        }
        else{
            y=ts-x;
        }
        int l=0;
        int r=0;
        int s=0;
        int m=-1;
        while(r<nums.length){
            s+=nums[r];
            while(s>y){
                s-=nums[l];
                l++;
            }
            if(s==y){
                m=Math.max(m,r-l+1);
            }
            r++;
        }
        if(m==-1){
            return -1;
        }
        else{
            return nums.length-m;
        }
    }
}