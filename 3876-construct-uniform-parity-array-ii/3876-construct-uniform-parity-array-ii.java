class Solution {
    public boolean uniformArray(int[] nums1) {
        int ec=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0){
                ec++;
            }
        }
        boolean y;
        if(ec==nums1.length){
            return true;
        }
        else{
            Arrays.sort(nums1);
            int x=nums1[0];
            if(x%2!=0){
                y=true;
            }
            else{
                y=false;
            }
        }
        return y;
    }
}