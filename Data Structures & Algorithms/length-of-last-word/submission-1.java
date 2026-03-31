class Solution {
    public int lengthOfLastWord(String s) {
        // Trim string to get rid of the extra spaces 
        // s = s.trim();
        // int n = s.length();
        
        // int i = n-1;
        // int cnt = 0;

        // while(i>=0){
        //     if(s.charAt(i)==' ' && i!=0){
        //         break;
        //     }
        //     cnt++;
        //     i--;
        // }

        // return cnt;

        // 2nd way 
        int i = s.length()-1;
        int len = 0;

        while(s.charAt(i)==' '){
            i--;
        }

        while(i>=0 && s.charAt(i)!=' '){
            len++;
            i--;
        }

        return len;
    }
}