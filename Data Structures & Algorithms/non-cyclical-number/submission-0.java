class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
        }while(slow!=fast);

        return slow==1;
    }

    private int squareSum(int n){
        int ans = 0;
        while(n>0){
            int ld = n%10;
            ans += ld*ld;
            n = n/10;
        }
        return ans;
    }
}
