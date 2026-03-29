class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        for(int num: nums){
            set.add(num);
        }

        if(n==set.size()){
            return false;
        }else{
            return true;
        }
    }
}