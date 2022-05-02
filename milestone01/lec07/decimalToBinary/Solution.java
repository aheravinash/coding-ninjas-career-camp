import java.util.Scanner;
public class Solution{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),
            binNum = 0,
            pow10 = 1;
        s.close();
        while(n > 0){
            binNum += (n % 2) * pow10;
            pow10 *= 10;
            n /= 2;
        }
        System.out.println(binNum);
    }
}
