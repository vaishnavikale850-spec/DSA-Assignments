class Solution {
    public List<Integer> majorityElement(int[] nums) {
         HashMap<Integer, Integer> hm = new HashMap<>();
         List<Integer> al = new ArrayList<>();
        
        for(int i = 0; i<nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
        for(int num : hm.keySet()){
            if(hm.get(num)>nums.length/3){
               al.add(num);
            }
        }
        return al;
        
    }
}