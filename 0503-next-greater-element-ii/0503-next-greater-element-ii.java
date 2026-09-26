class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int c=0;
        Stack<Integer> s=new Stack<>();
        int n=nums.length;
        int[] ans=new int[n];
        for(int j=0;j<n;j++){
            ans[j]=-1;
        }
        int i=0;
        while(c<2){
            while(!s.isEmpty() && nums[s.peek()]<nums[i]){
                int x=s.pop();
                ans[x]=nums[i];
            }
            s.push(i);
            i++;
            if(i==n){
                i=0;
                c++;
            }
        }
        return ans;
    }
}