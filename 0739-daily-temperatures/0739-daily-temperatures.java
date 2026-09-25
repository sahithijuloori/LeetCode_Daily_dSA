class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] ans=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            ans[i]=0;
        }
        for(int j=0;j<n;j++){
            while(!s.isEmpty() && temperatures[s.peek()]<temperatures[j]){
                int x=s.pop();
                ans[x]=j-x;
            }
            s.push(j);
        }
        return ans;
    }
}