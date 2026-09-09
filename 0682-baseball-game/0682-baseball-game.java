class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String c=operations[i];
            if(c.equals("D")){
                if(!s.isEmpty()){
                    int y=s.peek();
                    s.push(2*y);
                }
            }
            else if(c.equals("C")){
                if(!s.isEmpty()){
                    s.pop();
                }
            }
            else if(c.equals("+")){
                if(!s.isEmpty()){
                    int b=s.pop();
                    int x=0;
                    if(!s.isEmpty()){
                         x=s.peek();
                    }
                    s.push(b);
                    s.push(b+x);
                }
            }
            else{
                int d=Integer.parseInt(c);
                s.push(d);
            }
        }
        int sum=0;
        while(!s.isEmpty()){
            sum+=s.pop();
        }
        return sum;
    }
}