class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int ans=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum>=threshold*k){
            ans++;
        }
        int j=0;
        int z=k;
        while(z<arr.length){
            int x=arr[j];
            int y=arr[z];
            sum=sum+y-x;
            if(sum>=threshold*k){
                ans++;
            }
            j++;
            z++;
        }
        return ans;
    }
}