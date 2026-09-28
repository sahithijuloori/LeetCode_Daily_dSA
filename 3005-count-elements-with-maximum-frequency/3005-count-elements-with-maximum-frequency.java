class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            max=Math.max(max,map.get(nums[i]));
        }
        int c=0;
        for(int n:map.keySet()){
            if(map.get(n)==max){
                c+=map.get(n);
            }
        }
        return c;
    }
}