class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=0;
        while(l<r){
            int x=height[l];
            int y=height[r];
            int a=(r-l)*Math.min(x,y);
            if(x<y){
                l++;
            }
            else{
                r--;
            }
            max=Math.max(a,max);
        }
        return max;
    }
}