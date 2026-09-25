class Solution {
    public int[] finalPrices(int[] prices) {
       int[] ans=new int[prices.length];
       Stack<Integer> s=new Stack<>();
       for(int i=0;i<ans.length;i++){
        ans[i]=prices[i];
       } 
       for(int j=0;j<prices.length;j++){
        while(!s.isEmpty()&& prices[j]<=prices[s.peek()]){
            int x=s.pop();
            ans[x]=prices[x]-prices[j];
        }
        s.push(j);
       }
       return ans;
    }
}