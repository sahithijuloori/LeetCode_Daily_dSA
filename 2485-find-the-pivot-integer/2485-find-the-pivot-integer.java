class Solution {
    public int pivotInteger(int n) {
        int[] prefix=new int[n+2];
        prefix[0]=0;
        for(int i=0;i<n+1;i++){
            prefix[i+1]=prefix[i]+i;
        }
        for(int j=1;j<prefix.length;j++){
            int x=prefix[j];
            int y=prefix[n+1]-prefix[j-1];
            if(x==y){
                return j-1;
            }
        }
        return -1;
    }
}