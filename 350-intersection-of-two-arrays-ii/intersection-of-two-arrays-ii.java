class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> al = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i<nums1.length; i++){
            al.add(nums1[i]);
        }


        for(int i = 0; i<nums2.length; i++){
            if(al.contains(nums2[i])){
                ans.add(nums2[i]);
                al.remove(Integer.valueOf(nums2[i]));
            }
        }

        int[] arr = new int[ans.size()];
        for(int i = 0; i<ans.size(); i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}