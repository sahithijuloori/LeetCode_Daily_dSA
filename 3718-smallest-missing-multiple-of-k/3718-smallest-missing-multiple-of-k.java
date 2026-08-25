class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int x=k;
        int i=2;
        while (true){
            if(!set.contains(x)){
                return x;
            }
             x=k*i;
             i++;
        }
    }
}