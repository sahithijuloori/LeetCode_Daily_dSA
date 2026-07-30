class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int s=0;
        int m=0;
        if(tokens.length==0){
            return 0;
        }
        else{
            int l=0;
            int r=tokens.length-1;
            while(l<=r){
                int x=tokens[l];
                if(x<=power){
                    power=power-tokens[l];
                    l++;
                    s++;
                }
                else if(l!=r&&s>0){
                    s--;
                    power=power+tokens[r];
                    r--;
                }
                else{
                    break;
                }
                m=Math.max(m,s);
            }
        }
        return m;
    }
}