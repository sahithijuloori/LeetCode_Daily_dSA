class Solution {
    public String digitSum(String s, int k) {
        
        while(s.length()>k)
        {  String x = "";
        for(int i = 0;i<s.length();i+=k)
        {
            int end = Math.min(i+k,s.length());
            String a = s.substring(i,end);
            int sum = 0;
            for(int j = 0;j<a.length();j++)
            {
                sum+=a.charAt(j)-'0';
            } 
            x += sum;
        }
              s = x;
        }
        return s;
    }
}