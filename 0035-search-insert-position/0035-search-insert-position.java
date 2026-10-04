class Solution {
    public int searchInsert(int[] nums, int target) {
       int i=0;
       /*while(i<nums.length&&nums[i]<=target){
        if(nums[i]==target){
            return i;
        }
        i++;
       }
       return i;
    */
    int l=0;
    int h=nums.length-1;
    while(l<=h){
        int mid=l+(h-l)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]>target){
            h=mid-1;
        }
        else{
            l=mid+1;
        }
    }
    return l;
    }
}