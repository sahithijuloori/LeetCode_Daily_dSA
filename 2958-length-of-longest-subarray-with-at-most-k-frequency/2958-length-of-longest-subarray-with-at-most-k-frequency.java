class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int i=0;
       int j=0;
       int max=0;
       while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            j++;

        while(map.getOrDefault(nums[j-1],0)>k){
            map.put(nums[i],map.get(nums[i])-1);
            i++;
        }
        max=Math.max(max,j-i);
       } 
       return max;
    }
}