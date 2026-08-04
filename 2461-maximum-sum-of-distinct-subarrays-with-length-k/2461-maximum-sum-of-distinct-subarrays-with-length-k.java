class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max=0;
        long sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int x=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])==1){
                x++;
            }
        }
        if(x==k){
            max=sum;
        }
        int j=0;
        int z=k;
        while(z<nums.length){
            int l=nums[j];
            int y=nums[z];
            sum=sum+y-l;
            map.put(l,map.getOrDefault(l,0)-1);
            if(map.getOrDefault(l,0)==0){
                x--;
            }
            if(map.getOrDefault(y,0)==0){
                x++;
            }
            map.put(y,map.getOrDefault(y,0)+1);
            if(x==k){
                max=Math.max(max,sum);
            }
            j++;
            z++;
        }
        return max;
    }
}