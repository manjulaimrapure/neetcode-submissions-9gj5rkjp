class Solution {
    public int lengthOfLastWord(String s) {
        // Trim string to get rid of the extra spaces 
        // s = s.trim();
        String str = s.trim();
        int len = str.length();
        int cnt = 0;
        for(int i=len-1; i>=0; i--){
            if(str.charAt(i) ==' '){
                break;
            }else{
                cnt++;
            }
        }
        return cnt;

        // 2nd way 
        // int i = s.length()-1;
        // int len = 0;

        // while(s.charAt(i)==' '){
        //     i--;
        // }

        // while(i>=0 && s.charAt(i)!=' '){
        //     len++;
        //     i--;
        // }

        // return len;
    }
}