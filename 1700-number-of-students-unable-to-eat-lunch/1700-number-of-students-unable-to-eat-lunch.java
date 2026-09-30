class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int c1=0;
        int c0=0;
        Stack<Integer> s=new Stack<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=sandwiches.length-1;i>=0;i--){
            int x=sandwiches[i];
            s.push(x);
        }
        for(int j=0;j<students.length;j++){
            int y=students[j];
            q.offer(y);
            if(y==1){
                c1++;
            }
            else{
                c0++;
            }
        }
        while(!q.isEmpty()){
            int x=q.poll();
            int y=s.peek();
            if(y==x){
                s.pop();
                if(y==0){
                    c0--;
                }
                else{
                    c1--;
                }
            }
            else{
                q.offer(x);
                if(y==0 && c0==0){
                    break;
                }
                else if(y==1 && c1==0){
                    break;
                }
            }
        }
        return q.size();
    }
}