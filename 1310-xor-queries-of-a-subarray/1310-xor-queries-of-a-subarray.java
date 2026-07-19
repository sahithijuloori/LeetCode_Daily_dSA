class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefix=new int[arr.length];
        int[] ans=new int[queries.length];
        prefix[0]=arr[0];
        int k=0;
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]^arr[i];
        }
        for(int j=0;j<queries.length;j++){
            int x=queries[j][0];
            int y=queries[j][1];
            int z=0;
            if(x==0){
                z=prefix[y];
            }
            else{
                z=prefix[x-1]^prefix[y];
            }
            ans[k]=z;
            k++;
        }
        return ans;
    }
}