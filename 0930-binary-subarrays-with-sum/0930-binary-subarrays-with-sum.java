class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int j=0;j<prefix.length;j++){
            int x=prefix[j];
            if(map.containsKey(x-goal)){
                count+=map.get(x-goal);
            }
            map.put(x,map.getOrDefault(x,0)+1);
        }
        return count;
    }
}