class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            if(x<min){
                min=x;
            }
            if(x>max){
                max=x;
            }
        }
        Arrays.sort(nums);
        List<Integer> l=new ArrayList<>();
        int x=0;
        for(int i=min;i<=max;i++){
            int y=nums[x];
            if(y!=i){
                l.add(i);
            }
            else{
                x++;
            }
        }
        return l;
    }
}