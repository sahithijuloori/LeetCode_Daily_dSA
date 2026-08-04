class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum=0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
                sum+=customers[i];
            }
        }
        int extra=0;
        int j=0;
        int k=minutes;
        for(int i=0;i<k;i++){
            if(grumpy[i]==1){
                extra+=customers[i];
            }
        }
        int max2=extra;
        while(k<customers.length){
            int x=customers[j];
            int y=customers[k];
            if(grumpy[j]==1){
                extra-=x;
            }
            if(grumpy[k]==1){
                extra+=y;
            }
            max2=Math.max(max2,extra);
            j++;
            k++;
        }
        return sum+max2;
    }
}