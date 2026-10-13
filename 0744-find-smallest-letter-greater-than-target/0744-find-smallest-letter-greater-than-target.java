class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans=letters[0];
        char x=ans;
        int l=0;
        int h=letters.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(letters[mid]==target || letters[mid]<target){
                l=mid+1;
            }
            else{
                x=letters[mid];
                h=mid-1;
            }
        }
        ans=x;
        return ans;
    }
}