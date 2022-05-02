import java.util.Scanner;
public class Solution{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),
            deciNum = 0,
            pow2 = 1;
        while(n > 0){
            deciNum += (n % 10) * pow2;
            pow2 *= 2;
            n /= 10;
        }
        System.out.println(deciNum);
    }
}
