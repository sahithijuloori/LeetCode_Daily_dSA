class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c=0;
        for(int i=0;i<arr1.length;i++){
            boolean y=true;
            for(int j=0;j<arr2.length;j++){
                long x = Math.abs((long)arr1[i] - arr2[j]);
                if(x<=d){
                    y=false;
                    break;
                }
            }
            if(y==true){
                c++;
            }
        }
        return c;
    }
}