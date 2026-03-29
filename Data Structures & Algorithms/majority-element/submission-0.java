class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        int ele = 0;

        for(int i=0; i<n; i++){
            if(cnt==0){
                cnt++;
                ele = nums[i];
            }else if(ele==nums[i]){
                cnt++;
            }else{
                cnt--;
            }
        }

        int cnt2 = 0;
        for(int i=0; i<n; i++){
            if(ele==nums[i]){
                cnt2++;
            }
        }

        if(cnt2>n/2){
            return ele;
        }

        return -1;
    }
}