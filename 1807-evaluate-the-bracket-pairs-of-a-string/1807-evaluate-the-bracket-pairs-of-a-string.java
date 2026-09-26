class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder ans=new StringBuilder();
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        int j=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(ch=='('){
                StringBuilder sb=new StringBuilder();
                while(s.charAt(j)!=')'){
                    if(s.charAt(j)!=')' && s.charAt(j)!='('){
                    sb.append(s.charAt(j));
                    }
                    j++;
                }
                String key=sb.toString();
                if(map.containsKey(key)){
                    ans.append(map.get(key));
                }
                else{
                    String y="?";
                    ans.append(y);
                }
            }
            if(s.charAt(j)!=')'){
            ans.append(s.charAt(j));
            }
            j++;
        }
        return ans.toString();
    }
}