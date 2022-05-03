import java.util.*;
import java.lang.*;
public class Solution{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),
            maxNum = Integer.MIN_VALUE,
            num,
            pow10 = 1;
        while(n / pow10 > 0){
            num = (n / (10 * pow10)) * pow10 + n % pow10;
            if(num > maxNum)
                maxNum = num;
            pow10 *= 10;
        }
        System.out.println(maxNum);
    }
}
