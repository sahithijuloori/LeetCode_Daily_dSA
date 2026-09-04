class Solution {
    public int firstStableIndex(int[] nums, int k) {
       int max=nums[0];
       List<Integer> l=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        l.add(nums[i]);
       }
       for(int j=0;j<nums.length;j++){
        int x=nums[j];
        if(max<x){
            max=x;
        }
        int y=Collections.min(l);
        int z=max-y;
        if(z<=k){
            return j;
        }
        l.remove(0);
       }
       return -1;
    }
}