class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
      Set<List<Integer>> s=new HashSet<>();
      Arrays.sort(nums);
      for(int i=0;i<nums.length-3;i++){
        for(int j=i+1;j<nums.length-2;j++){
            long y=(long)nums[j]+nums[i];
            int l=j+1;
            int r=nums.length-1;
            while(l<r){
                long z=nums[l]+nums[r]+y;
                if(z==target){
                    s.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                    l++;
                    r--;
                }
                else if(z<target){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
      } 
      List<List<Integer>> l=new ArrayList<>();
      for(List<Integer> li:s){
        l.add(li);
      } 
      return l;
    }
}