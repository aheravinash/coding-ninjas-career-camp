import java.util.Scanner;
public class Solution{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),
            revNum = 0;
        s.close();
        while(n > 0){
            revNum = revNum * 10 + n % 10;
            n /= 10;
        }
        System.out.println(revNum);
    }
}
