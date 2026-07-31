class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double avg=sum/k;
        double max=avg;
        int j=0;
        int z=k-1;
        while(z<nums.length-1){
            int x=nums[j];
            int y=nums[z+1];
            sum=sum+y-x;
            avg=sum/k;
            max=Math.max(avg,max);
            j++;
            z++;
        }
        return max;
    }
}