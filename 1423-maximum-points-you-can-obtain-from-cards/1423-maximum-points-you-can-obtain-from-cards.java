class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int ts=0;
        for(int i=0;i<cardPoints.length;i++){
            ts+=cardPoints[i];
        }
        int sum=0;
        for(int i=0;i<cardPoints.length-k;i++){
            sum+=cardPoints[i];
        }
        int c=0;
        int j=cardPoints.length-k;
        int min=sum;
        while(j<cardPoints.length){
            int x=cardPoints[c];
            int y=cardPoints[j];
            sum=sum+y-x;
            min=Math.min(min,sum);
            c++;
            j++;
        }
        return ts-min;
    }
}