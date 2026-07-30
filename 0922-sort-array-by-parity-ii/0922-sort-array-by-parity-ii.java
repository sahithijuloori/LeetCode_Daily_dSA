class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i=0;
        int j=0;
        while(j<nums.length){
            int x=nums[j];
            if(x%2==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            j++;
        }
        int l=1;
        int r=nums.length-2;
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l+=2;
            r-=2;
        }
        return nums;
    }
}