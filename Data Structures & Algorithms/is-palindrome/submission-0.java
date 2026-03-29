class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int n = str.length();

        int left = 0;
        int right = n-1;

        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;      
        }

        return true;
    }
}
