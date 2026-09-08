class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> s1=new Stack<>();
        char[] c=s.toCharArray();
        s1.push(c[0]);
        for(int i=1;i<c.length;i++){
            //char y=s1.peek();
            if(!s1.isEmpty()&&s1.peek()==c[i]){
                s1.pop();
            }
            else{
                s1.push(c[i]);
            }
        }
        while(!s1.isEmpty()){
            sb.append(s1.pop());
        }
        return sb.reverse().toString();
    }
}