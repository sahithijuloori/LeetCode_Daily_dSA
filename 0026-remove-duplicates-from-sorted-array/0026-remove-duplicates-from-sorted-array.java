class Solution {
    public int removeDuplicates(int[] nums) {
        /*ArrayList<Integer> set=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
            set.add(nums[i]);
            }
        }
        int sum=set.size();
        int j=0;
        for(int x:set){
            nums[j]=x;
            j++;
        }
        return sum;*/
        int i=1;
        int j=1;
        int sum=1;
        while(j<nums.length){
            if(nums[j]!=nums[i-1]){
                nums[i]=nums[j];
                i++;
                j++;
                sum+=1;
            }
            else{
                j++;
            }
        }
        return sum;
    }
}