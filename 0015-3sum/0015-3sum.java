class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        Set<List<Integer>> s=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int x=-nums[i];
            int j=i+1;
            int k=nums.length-1;
           // HashSet<Integer> set=new HashSet<>();
            while(j<k){
                int y=nums[j]+nums[k];
                if(y==x){
                    s.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(y<x){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        for(List<Integer> li:s){
            l.add(li);
        }
        return l;
    }
}