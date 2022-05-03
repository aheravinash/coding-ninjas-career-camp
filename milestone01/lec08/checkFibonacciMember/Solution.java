import java.util.*;
import java.lang.*;
public class Solution{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        // A number is a Fibonacci number if and only if one or both of
        // (5*n^2 + 4) and (5*n^2 - 4) is a perfect square
        int n1 = 5*n*n + 4,
            n2 = n1 - 8,
            sq1 = (int)(Math.sqrt(n1)),
            sq2 = (int)(Math.sqrt(n2));
        if(sq1*sq1 == n1 || sq2*sq2 == n2) System.out.println(true);
        else System.out.println(false);
    }
}
