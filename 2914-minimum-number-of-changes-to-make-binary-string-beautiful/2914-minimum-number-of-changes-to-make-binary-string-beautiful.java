class Solution {
    public int minChanges(String s) {
        int c=0;
        int i=0;
        int j=1;
        while(j<s.length()){
            char x=s.charAt(i);
            char y=s.charAt(j);
            if(x!=y){
                c++;
            }
            i=i+2;
            j=j+2;
        }
        return c;
    }
}