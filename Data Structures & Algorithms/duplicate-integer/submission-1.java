class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        // for(int num: nums){
        //     set.add(num);
        // }

        // if(n==set.size()){
        //     return false;
        // }else{
        //     return true;
        // }

        for(int num: nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }

        return false;
    }
}