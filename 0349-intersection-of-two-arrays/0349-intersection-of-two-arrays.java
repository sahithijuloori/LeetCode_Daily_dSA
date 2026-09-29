class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> ans=new HashSet<>();
        HashSet<Integer> sa=new HashSet<>();
        for(int i:nums1){
            sa.add(i);
        }
        for(int j:nums2){
            if(sa.contains(j)){
                ans.add(j);
            }
        }
        int[] arr=new int[ans.size()];
        int k=0;
        for(int num:ans){
            arr[k]=num;
            k++;
        }
        return arr;
    }
}