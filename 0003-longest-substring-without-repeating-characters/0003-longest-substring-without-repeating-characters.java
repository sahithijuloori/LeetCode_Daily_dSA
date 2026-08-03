class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int sum=0;
        int max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(r<s.length()){
            char ch=s.charAt(r);
            if(map.getOrDefault(ch,0)==0){
                map.put(ch,1);
                r++;
                max=Math.max(max,r-l);
            }
            else{
                map.put(s.charAt(l),0);
                l++;
               
            }
        }
        
        return max;
    }
}