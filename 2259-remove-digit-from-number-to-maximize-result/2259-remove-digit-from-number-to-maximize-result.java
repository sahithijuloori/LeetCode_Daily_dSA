class Solution {
    public String removeDigit(String number, char digit) {
        String max="";
        String x="";
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)==digit){
                x=number.substring(0,i)+number.substring(i+1);
                if(x.compareTo(max)>0){
                    max=x;
                }
            }
        }
        return max;
    }
}