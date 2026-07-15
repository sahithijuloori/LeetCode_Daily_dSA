class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        for(int j=0;j<prefix.length;j++){
            int x=prefix[j]%k;
            if(x<0){
                x=k+x;
            }
            if(map.containsKey(x)){
                count+=map.get(x);
            }
            map.put(x,map.getOrDefault(x,0)+1);
            
            
        }
        return count;
    }
}