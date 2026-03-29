class Solution {
    public int removeElement(int[] nums, int val) {
        // Brute force approach 
        // TC -> O(N)
        // SC -> O(N)

        // int n = nums.length;
        // List<Integer> ans = new ArrayList<>();

        // for(int i=0; i<n; i++){
        //     if(nums[i]!=val){
        //         ans.add(nums[i]);
        //     }
        // }

        // for(int i=0; i<ans.size(); i++){
        //     nums[i]=ans.get(i);
        // }
        // return ans.size();

        int n = nums.length;
        int k = 0;

        for(int i=0; i<n; i++){
            if(nums[i]!=val){
                nums[k++] = nums[i];
            }
        }

        return k;
    }
}