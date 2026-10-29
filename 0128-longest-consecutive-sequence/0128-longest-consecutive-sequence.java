class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int max=0;
        for(int x:set){
            if(!set.contains(x-1)){
                int current=x;
                int length=0;
                while(set.contains(current)){
                    current++;
                    length++;
                }
                if(length>max){
                    max=length;
                }
            }
        }
        return max;
    }
}