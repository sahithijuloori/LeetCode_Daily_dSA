class Solution {
    public int maximumLengthSubstring(String s) {
        char[] c=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int max=0;
        while(j<c.length){
            char b=c[j];
            map.put(b,map.getOrDefault(b,0)+1);
            while(map.getOrDefault(c[j],0)>2){
                map.put(c[i],map.getOrDefault(c[i],0)-1);
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}