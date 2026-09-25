class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s=new Stack();
        int[] ans=new int[nums1.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            while(!s.isEmpty()&& nums2[s.peek()]<nums2[i]){
                int x=s.pop();
                map.put(nums2[x],nums2[i]);
            }
            s.push(i);
        }
        for(int j=0;j<nums1.length;j++){
            if(map.getOrDefault(nums1[j],0)!=0){
                ans[j]=map.get(nums1[j]);
            }
            else{
                ans[j]=-1;
            }
        }
        return ans;
    }
}