class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       int[] prefix=new int[nums.length];
       if(nums[0]%2==0){
        prefix[0]=0;
       }
       else{
        prefix[0]=1;
       }
       for(int i=1;i<nums.length;i++){
        if(nums[i]%2==0){
            nums[i]=0;
        }
        else{
            nums[i]=1;
        }
        prefix[i]=prefix[i-1]+nums[i];
       } 
       HashMap<Integer,Integer> map=new HashMap<>();
       map.put(0,1);
       int count=0;
       for(int j=0;j<prefix.length;j++){
        int x=prefix[j]-k;
        if(map.containsKey(x)){
            count+=map.get(x);
        }
        map.put(prefix[j],map.getOrDefault(prefix[j],0)+1);
       }
       return count;
    }
}