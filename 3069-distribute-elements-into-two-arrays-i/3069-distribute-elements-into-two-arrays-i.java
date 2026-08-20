class Solution {
    public int[] resultArray(int[] nums) {
        int[] ans=new int[nums.length];
        int x=nums.length/2;
        if(x%2!=0){
            x=x+1;
        }
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int j=0;
        int k=0;
        for(int i=2;i<nums.length;i++){
            int y=arr1.get(j);
            int z=arr2.get(k);
            if(y>z){
                arr1.add(nums[i]);
                j++;
            }
            else{
                arr2.add(nums[i]);
                k++;
            }
        }
        int y=0;
        for(int l=0;l<arr1.size();l++){
            ans[l]=arr1.get(l);
            y++;
        }
        for(int z=0;z<arr2.size();z++){
            ans[y]=arr2.get(z);
            y++;
        }
        return ans;
    }
}