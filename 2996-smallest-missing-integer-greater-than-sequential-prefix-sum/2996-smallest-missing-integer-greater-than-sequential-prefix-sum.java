class Solution {
    public int missingInteger(int[] nums) {
        int i=1;
        int sum=0;
        while(i<nums.length && nums[i-1]+1==nums[i]){
            sum+=nums[i-1];
            i++;
        }
        sum+=nums[i-1];
        Arrays.sort(nums);
        for(int j =0;j<nums.length;j++){
            if(nums[j]==sum){
                sum++;
            }
        }
        return sum;
    }
}