class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int n = s.length();
        
        int i = n-1;
        int cnt = 0;

        while(i>=0){
            if(s.charAt(i)==' ' && i!=0){
                break;
            }
            cnt++;
            i--;
        }

        return cnt;
    }
}