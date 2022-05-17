import java.util.Scanner;
public class Solution{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(),
            b = s.nextInt();
        s.close();
        System.out.println(allPossibleWays(a, b, 1, ""));
    }
    public static int allPossibleWays(int a, int b, int i, String combinationSoFar){
        int i_pow_b = pow(i, b),
            count = 0;
        while(i_pow_b <= a){
            int new_a = a - i_pow_b;
            String newCombination = combinationSoFar + i + " ";
            if(new_a == 0){
                count++;
                System.out.println(newCombination);
            }
            else if(new_a > 0){
                count += allPossibleWays(new_a, b, i + 1, newCombination);
            }
            i_pow_b = pow(++i, b);
        }
        return count;
    }
    public static int pow(int x, int y){
        if(x < 2) return x;
        int ans = 1;
        for(; y > 0; y--){
            ans *= x;
        }
        return ans;
    }
}
