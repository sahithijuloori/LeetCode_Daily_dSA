class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        int j=1;
        map.put(nums[i],i+1);
        while(j<nums.length){
            int y=nums[j];
            if(map.getOrDefault(y,0)>0){
                int c=map.get(y)-1;
                int b=j-c;
                if(b<=k){
                    return true;
                }
            }
            map.put(y,j+1);
            j++;
        }
        return false;
    }
}