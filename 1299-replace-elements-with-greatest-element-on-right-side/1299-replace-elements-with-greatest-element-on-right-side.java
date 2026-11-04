class Solution {
    public int[] replaceElements(int[] arr) {
       int[] prefix=new int[arr.length];
       int y=prefix.length-1;
       prefix[y]=-1;
       for(int i=y;i>0;i--){
        if(arr[i]>prefix[i]){
            prefix[i-1]=arr[i];
        }
        else{
            prefix[i-1]=prefix[i];
        }
       }
       return prefix;
    }
}