class Solution {
    public int minMoves(int[] nums) {
        int moves=0;
        Arrays.sort(nums);
        int x=nums[nums.length-1];
        int i=0;
        while(nums[i]<x){
            moves+=x-nums[i];
            i++;
        }
        return moves;
    }
}