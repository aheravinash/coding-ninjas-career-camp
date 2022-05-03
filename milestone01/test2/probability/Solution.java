import java.util.*;
import java.lang.*;
public class Solution{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),
            x = s.nextInt();
        System.out.println(100 * nCr(4,x) * nCr(4, n-x) / nCr(8,n));
    }
    public static int nCr(int n, int r){
		if(n < 2 || n == r || r == 0)
			return 1;
		if(r > n/2)
			r = n - r; // because nCr is equal to nC(n-r)
		int numerator = n;
		int denominator = r;
		for(int i = 1; i < r; i++){
			numerator *= n-i;
			denominator *= i;
		}
		return numerator/denominator;
	}
}
