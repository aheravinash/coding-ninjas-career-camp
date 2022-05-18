import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        System.out.println(sumOfPowersOfThree(n, 0, ""));
        //System.out.println(pow(0,0));
    }
    public static int sumOfPowersOfThree(int n, int i, String sumSoFar) {
        int three_pow_i = pow(3, i),
            count = 0;
        while(three_pow_i <= n){
            String newSum = sumSoFar + i + " ";
            int new_n = n - three_pow_i;
            if(new_n == 0){
                System.out.println(newSum);
                count++;
            }
            else if(new_n > 0){
                count += sumOfPowersOfThree(new_n, i + 1, newSum);
            }
            three_pow_i = pow(3, ++i);
        }
        return count;
    }
    public static int pow(int x, int y) {
        if(y == 0) return 1;
        if(x < 2) return x;
        int ans = 1;
        for(; y > 0; y--){
            ans *= x;
        }
        return ans;
    }
}