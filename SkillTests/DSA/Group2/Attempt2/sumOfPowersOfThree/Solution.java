import java.lang.Math;
class Solution {
    static public boolean checkPowersOfThree(int n) {
        
        // Write your code here
        int count = helper(n, 0);
        if(count > 0) return true;
        return false;
    }
    public static int helper(int n, int i){
        int tpi = (int)Math.pow(3, i);
        int count = 0;
        while(tpi <= n){
            int newn = n - tpi;
            if(newn == 0) ++count;
            else if(newn > 0){
                count += helper(newn, i + 1);
                if(count > 0) return count;
            }
            tpi = (int)Math.pow(3, ++i);
        }
        return count;
    }
}
