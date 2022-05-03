import java.util.Scanner;
public class Solution{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),
            revNum = 0,
            ncopy = n;
        s.close();
        while(n > 0){
            revNum = revNum * 10 + n % 10;
            n /= 10;
        }
        if(revNum == ncopy){
            System.out.println(true);
        }
        else System.out.println(false);
        // Drawbacks: does not cover whole integer range; would produce wrong results for N near Integer.MAX_VALUE
    }
}
