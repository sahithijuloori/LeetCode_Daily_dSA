class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int i=0;
        int j=0;
        int min=s.length()+1;
        int c=0;
        String ans = "";
        while(j<s.length()){
            if(s.charAt(j)=='1'){
                c++;
            }
            while(c==k && i<s.length()){
                int len = j - i + 1;
                String curr = s.substring(i, j + 1);
                 if (len < min || (len == min && curr.compareTo(ans) < 0)) {
                    min = len;
                    ans = curr;
                }
                char b=s.charAt(i);
                if(b=='1'){
                    c--;
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}