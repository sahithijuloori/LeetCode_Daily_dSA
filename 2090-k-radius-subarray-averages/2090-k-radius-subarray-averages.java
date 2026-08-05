class Solution {
    public int[] getAverages(int[] nums, int k) {
        int b=nums.length;
        int[] arr=new int[b];
        if(k==0){
            return nums;
        }
        Arrays.fill(arr,-1);
        int y=2*k+1;
        if(arr.length<y){
            return arr;
        }
        else{
            int j=0;
            int z=y;
            int c=k;
            long sum=0;
            for(int i=0;i<y;i++){
                sum+=nums[i];
            }
            int avg=(int)(sum/y);
            arr[c]=avg;
            c++;
            while(z<nums.length){
                int x=nums[j];
                int d=nums[z];
                sum=sum+d-x;
                avg=(int)(sum/y);
                arr[c]=avg;
                c++;
                j++;
                z++;
            }
            return arr;
        }
    }
}