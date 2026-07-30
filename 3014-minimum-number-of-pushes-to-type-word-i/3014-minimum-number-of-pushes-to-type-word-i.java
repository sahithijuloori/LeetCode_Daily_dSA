class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        char[] c=word.toCharArray();
        for(int i=0;i<c.length;i++){
            char ch=c[i];
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character,Integer>> l=new ArrayList<>(map.entrySet());
        l.sort((a,b)->b.getValue()-a.getValue());
        int sum=0;
        for(int i=0;i<l.size();i++){
            int x=l.get(i).getValue();
            if(i<8){
                sum+=x;
            }
            else if(i>=8 && i<16){
                sum+=(x*2);
            }
            else if(i>=16 && i<24){
                sum+=(x*3);
            }
            else{
                sum+=(x*4);
            }
        }
        return sum;
    }
}