class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
       /* int i=0;
        int sum=0;
        while(tickets[k]>0){
            while(i<tickets.length &&tickets[k]>0){
                 int x=tickets[i];
                if(x>0){
                    sum++;
                    tickets[i]--;
                }
                i++;
            }
            i=0;
        }
        return sum;*/
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            q.offer(tickets[i]);
            if(i==k){
                q.offer(-1);
            }
        }
        int sum=0;
        while(!q.isEmpty()){
            int x=q.poll()-1;
            sum++;
            if(q.peek()==-1){
                if(x==0){
                    return sum;
                }
                else{
                    q.offer(x);
                    q.offer(q.poll());
                }
            }
            else{
                if(x!=0){
                    q.offer(x);
                }
            }
        }
        return sum;
    }
}