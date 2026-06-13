class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> n = new HashSet<>(); 
        for (int i = 0 ; i < nums.length; i++){
            n.add(nums[i]);
        }
        if (n.size() < nums.length) {
            return true;
        }
        return false; 
    }
}